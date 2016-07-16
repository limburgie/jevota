package be.jevota.service;

import be.jevota.domain.GameLineup;
import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.PingpongTeam;
import be.jevota.domain.cal.CalendarWeek;
import be.jevota.domain.cal.SeasonWeek;
import be.jevota.service.exception.InvalidEmailException;

public interface LineupService {

	GameLineup getOrCreateLineupForTeamInSeasonWeek(PingpongTeam team, SeasonWeek week);
	
	GameLineup getOrCreateLineupForTeamInCalendarWeek(PingpongTeam team, CalendarWeek calendarWeek);
	
	GameLineup getLineupForTeamInGame(PingpongTeam team, PingpongGame game);
	
	GameLineup saveLineup(GameLineup lineup);

	GameLineup getLineup(long lineupId);
	
	void notifyPlayers(PingpongPlayer from, long lineupId) throws InvalidEmailException;

}
