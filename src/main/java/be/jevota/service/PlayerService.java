package be.jevota.service;

import be.jevota.domain.PingpongPlayer;
import be.jevota.service.exception.InvalidEmailException;
import be.jevota.service.exception.InvalidPasswordUpdateException;
import be.jevota.service.exception.LoginException;

import java.util.List;

public interface PlayerService {

	List<PingpongPlayer> getActivePlayers(boolean maleOnly);
	
	PingpongPlayer getPlayerByEmail(String emailAddress);

	PingpongPlayer login(String emailAddress, String password) throws LoginException;

	PingpongPlayer getPlayer(Long valueOf);
	
	PingpongPlayer savePlayer(PingpongPlayer player);

	PingpongPlayer updateProfile(PingpongPlayer player) throws InvalidEmailException;

	List<PingpongPlayer> getNewPlayers();

	List<PingpongPlayer> searchByName(String query);

	List<PingpongPlayer> getPlayers();
	
	void deletePlayer(PingpongPlayer player);
	
	void generateAndEmailNewPassword(PingpongPlayer player) throws InvalidEmailException;
	
	void sendNewPasswordLink(PingpongPlayer player) throws InvalidEmailException;

	PingpongPlayer updatePassword(PingpongPlayer player, String oldPassword, String newPassword, String repeatNewPassword) throws InvalidPasswordUpdateException;

	List<PingpongPlayer> getPlayers(boolean recreation);

	int generateAndEmailNewPasswords();

	void generateAndEmailNewPassword(long id, int memberNo) throws InvalidEmailException;

	int sendMailToAll(String subject, String body);
	
}
