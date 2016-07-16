package be.jevota.service.impl;

import be.jevota.domain.*;
import be.jevota.domain.cal.CalendarWeek;
import be.jevota.domain.cal.SeasonWeek;
import be.jevota.domain.type.RoleName;
import be.jevota.repository.LineupRepository;
import be.jevota.service.GameService;
import be.jevota.service.LineupService;
import be.jevota.service.MailService;
import be.jevota.service.RoleService;
import be.jevota.service.exception.InvalidEmailException;
import org.apache.commons.lang.StringUtils;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

@Named
public class LineupServiceImpl implements LineupService {

	@Inject private LineupRepository repo;
	@Inject private GameService gameService;
	@Inject private MailService mailService;
	@Inject private RoleService roleService;

	@Transactional
	public GameLineup getOrCreateLineupForTeamInSeasonWeek(PingpongTeam team, SeasonWeek week) {
		PingpongGame game = gameService.getGameForTeamInSeasonWeek(week, team);
		if (game == null) {
			return null;
		}
		return getOrCreateLineupForTeamInGame(team, game);
	}

	@Transactional
	public GameLineup getOrCreateLineupForTeamInCalendarWeek(PingpongTeam team, CalendarWeek week) {
		PingpongGame game = gameService.getGameForTeamInCalendarWeek(week, team);
		if (game == null) {
			return null;
		}
		return getOrCreateLineupForTeamInGame(team, game);
	}

	private GameLineup getOrCreateLineupForTeamInGame(PingpongTeam team, PingpongGame game) {
		GameLineup lineup = getLineupForTeamInGame(team, game);
		if (lineup == null) {
			lineup = new GameLineup();
			lineup.setGame(game);
			lineup.setTeam(team);
			lineup.setPlayers(new HashSet<PingpongPlayer>());
			lineup = repo.save(lineup);
		}
		return lineup;
	}

	public GameLineup getLineupForTeamInGame(PingpongTeam team, PingpongGame game) {
		return repo.findByGameAndTeam(game, team);
	}

	@Transactional
	public GameLineup saveLineup(GameLineup lineup) {
		return repo.save(lineup);
	}

	public GameLineup getLineup(long lineupId) {
		return repo.findOne(lineupId);
	}

	@Transactional
	public void notifyPlayers(PingpongPlayer from, long lineupId) throws InvalidEmailException {
		GameLineup lineup = getLineup(lineupId);
		PingpongGame game = lineup.getGame();
		PingpongTeam team = lineup.getTeam();
		SimpleDateFormat dateFormat = new SimpleDateFormat("E dd/MM 'om' HH'u'mm", new Locale("nl", "BE"));
		String date = dateFormat.format(game.getDate());
		Collection<PingpongPlayer> players = lineup.getPlayers();
		Collection<PingpongPlayer> cc = roleService.getOrCreateRole(RoleName.LINEUP_MANAGER).getPlayers();
		String title = "Ploegopstelling " + team.getName() + " - " + date;
		PingpongClub homeClub = game.getHomeTeam().getClub();
		String body = "Beste,\n\n" + "Jullie staan opgesteld voor de wedstrijd tegen " + lineup.getOpponent().getName()
				+ ":\n- " + StringUtils.join(players, "\n- ") + "\n\nDeze wedstrijd wordt op " + date
				+ " gespeeld op de volgende locatie:\n\n" + homeClub.getName() + "\n"
				+ homeClub.getAddress().getFullAddress("\n") + "\n\n"
				+ "Graag een seintje als dit niet voor je lukt.\n\n" + "T.T.C. Jevota Lanaken";
		mailService.sendEmail(from, players, cc, title, body, true);
		updateLineupDate(lineup);
	}

	private void updateLineupDate(GameLineup lineup) {
		lineup.setSendDate(new Date());
		saveLineup(lineup);
	}

}
