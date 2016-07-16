package be.jevota.service.impl;

import be.jevota.domain.Address;
import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.type.FieldUpdate;
import be.jevota.domain.type.RoleName;
import be.jevota.repository.PlayerRepository;
import be.jevota.service.GeoService;
import be.jevota.service.MailService;
import be.jevota.service.PlayerService;
import be.jevota.service.RoleService;
import be.jevota.service.exception.InvalidEmailException;
import be.jevota.service.exception.InvalidPasswordUpdateException;
import be.jevota.service.exception.LoginException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.*;

@Named
public class PlayerServiceImpl implements PlayerService {

	@Inject private PlayerRepository repository;

	@Inject private MailService mailService;
	@Inject private GeoService geoService;
	@Inject private RoleService roleService;

	public List<PingpongPlayer> getActivePlayers(boolean maleOnly) {
		List<PingpongPlayer> players = null;
		if (maleOnly) {
			players = repository.findByActiveAndMaleOrderByRankingAscLastNameAsc(true, true);
		} else {
			players = repository.findByActiveOrderByRankingAscLastNameAsc(true);
		}
		for (int i = 0; i < players.size(); i++) {
			PingpongPlayer player = players.get(i);
			player.setIndex(getIndex(players, player, i));
		}
		return players;
	}

	public List<PingpongPlayer> getPlayers(boolean recreation) {
		if (recreation) {
			return repository.findByActiveAndRecreationOrderByRankingAscLastNameAsc(true, true);
		}
		return repository.findByActiveOrderByRankingAscLastNameAsc(true);
	}

	private int getIndex(List<PingpongPlayer> players, PingpongPlayer player, int from) {
		int index = from + 1;
		for (int j = index; j < players.size(); j++) {
			if (!players.get(j).getRanking().equals(player.getRanking())) {
				return j;
			}
		}
		return players.size();
	}

	public PingpongPlayer getPlayerByEmail(String emailAddress) {
		return repository.findByEmailAddress(emailAddress);
	}

	@Transactional
	public PingpongPlayer login(String emailAddress, String password) throws LoginException {
		if (StringUtils.isBlank(emailAddress) || StringUtils.isBlank(password)) {
			throw new LoginException();
		}
		PingpongPlayer player = getPlayerByEmail(emailAddress);
		if (player == null) {
			throw new LoginException();
		}
		String passHash = hashPassword(player, password);
		if (player == null || !player.getPassword().equals(passHash)) {
			throw new LoginException();
		}
		player.setLastLoginDate(new Date());
		repository.save(player);
		return player;
	}

	public PingpongPlayer getPlayer(Long id) {
		return repository.findOne(id);
	}

	@Transactional
	public PingpongPlayer savePlayer(PingpongPlayer player) {
		if (player.getId() == null) {
			player.setCreateDate(new Date());
		}
		if (StringUtils.isEmpty(player.getEmailAddress())) {
			player.setEmailAddress(null);
		}
		if (player.getMemberNo() != null && player.getMemberNo() == 0) {
			player.setMemberNo(null);
		}
		Address address = player.getAddress();
		address.setPosition(geoService.getGeoPosition(address));
		return repository.save(player);
	}

	public List<PingpongPlayer> getNewPlayers() {
		return repository.findByActiveOrderByMemberNoDesc(true);
	}

	public List<PingpongPlayer> searchByName(String query) {
		return repository.searchByName(query);
	}

	public List<PingpongPlayer> getPlayers() {
		return repository.findAll();
	}

	@Transactional
	public void deletePlayer(PingpongPlayer player) {
		repository.delete(player);
	}

	@Transactional(rollbackFor = InvalidEmailException.class)
	public void generateAndEmailNewPassword(PingpongPlayer player) throws InvalidEmailException {
		String newPassPlaintext = RandomStringUtils.randomAlphanumeric(8);
		String newPassHash = hashPassword(player, newPassPlaintext);
		player.setPassword(newPassHash);
		repository.save(player);
		mailService.sendEmail(player, "Nieuw wachtwoord", "Beste " + player.getFullName() + ",\n\n"
				+ "Er werd een nieuw wachtwoord voor je gegenereerd.\n"
				+ "Hiermee kan je inloggen op http://www.jevota.be\n\n" + "Je nieuw wachtwoord is:\n"
				+ newPassPlaintext + "\n\n" + "T.T.C. Jevota Lanaken", false);
	}

	public void sendNewPasswordLink(PingpongPlayer player) throws InvalidEmailException {
		mailService.sendEmail(player, "Nieuw wachtwoord", "Beste " + player.getFullName() + ",\n\n"
				+ "Er werd een nieuw wachtwoord aangevraagd op de website van T.T.C. Jevota Lanaken.\n"
				+ "Klik op onderstaande link om een nieuw wachtwoord te genereren voor de website.\n"
				+ "Dit wachtwoord zal doorgestuurd worden op dit adres.\n\n"
				+ "Als je geen nieuw wachtwoord wenste te genereren, negeer dan deze email.\n\n"
				+ "http://www.jevota.be/pages/reset-password.jsf?i=" + player.getId() + "&m=" + player.getMemberNo()
				+ "\n\n" + "T.T.C. Jevota Lanaken", false);
	}

	@Transactional
	public int generateAndEmailNewPasswords() {
		List<PingpongPlayer> players = repository.getPlayersWithEmailWithoutPassword();
		for (PingpongPlayer player : players) {
			try {
				generateAndEmailNewPassword(player);
			} catch (InvalidEmailException e) {
				// cannot occur
			}
		}
		return players.size();
	}

	@Transactional(rollbackFor = InvalidPasswordUpdateException.class)
	public PingpongPlayer updatePassword(PingpongPlayer player, String oldPassword, String newPassword,
			String repeatNewPassword) throws InvalidPasswordUpdateException {
		String existingPassHash = player.getPassword();
		String oldPassHash = hashPassword(player, oldPassword);
		String newPassHash = hashPassword(player, newPassword);
		if (existingPassHash != null && !existingPassHash.equals(oldPassHash)) {
			throw new InvalidPasswordUpdateException("Oud wachtwoord is niet correct");
		}
		if (newPassword != null && !newPassword.equals(repeatNewPassword)) {
			throw new InvalidPasswordUpdateException("Nieuwe wachtwoorden komen niet overeen");
		}
		if (existingPassHash != null && existingPassHash.equals(newPassHash)) {
			throw new InvalidPasswordUpdateException("Nieuw wachtwoord is gelijk aan oud wachtwoord");
		}
		player.setPassword(newPassHash);
		return repository.save(player);
	}

	private String hashPassword(PingpongPlayer player, String password) {
		return DigestUtils.sha256Hex(password + player.getId());
	}

	@Transactional(rollbackFor = InvalidEmailException.class)
	public PingpongPlayer updateProfile(PingpongPlayer player) throws InvalidEmailException {
		List<FieldUpdate> fieldUpdates = new ArrayList<FieldUpdate>();
		PingpongPlayer oldPlayer = getPlayer(player.getId());
		if (!oldPlayer.getEmailAddress().equals(player.getEmailAddress())) {
			fieldUpdates.add(new FieldUpdate("E-mailadres", oldPlayer.getEmailAddress(), player.getEmailAddress()));
		}
		if (!oldPlayer.getAddress().equals(player.getAddress())) {
			fieldUpdates.add(new FieldUpdate("Adres", oldPlayer.getAddress().getFullAddress(", "), player.getAddress()
					.getFullAddress(", ")));
		}
		if (!oldPlayer.getPhoneNumbers().equals(player.getPhoneNumbers())) {
			fieldUpdates.add(new FieldUpdate("Telefoonnummers", StringUtils.join(oldPlayer.getPhoneNumbers(), ", "),
					StringUtils.join(player.getPhoneNumbers(), ", ")));
		}
		PingpongPlayer result = savePlayer(player);
		if (!fieldUpdates.isEmpty()) {
			Set<PingpongPlayer> to = Collections.emptySet();
			List<PingpongPlayer> cc = roleService.getOrCreateRole(RoleName.PLAYER_MANAGER).getPlayers();
			String subject = "Profiel update van " + player.getFullName();
			String body = "Beste beheerder,\n\n" + player.getFullName() + " heeft zojuist zijn profiel aangepast.\n"
					+ "Hierin werden volgende wijzigingen aangebracht:";
			for (FieldUpdate fieldUpdate : fieldUpdates) {
				body += "\n\n" + fieldUpdate;
			}
			body += "\n\nT.T.C. Jevota Lanaken";
			mailService.sendEmail(null, to, cc, subject, body, true);
		}
		return result;
	}

	public void generateAndEmailNewPassword(long id, int memberNo) throws InvalidEmailException {
		PingpongPlayer player = getPlayer(id);
		if (player != null && player.getMemberNo() != null && player.getMemberNo() == memberNo) {
			generateAndEmailNewPassword(player);
		}
	}

}
