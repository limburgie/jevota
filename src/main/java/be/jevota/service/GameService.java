package be.jevota.service;

import java.util.List;

import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongTeam;
import be.jevota.domain.cal.CalendarWeek;
import be.jevota.domain.cal.SeasonWeek;
import be.jevota.domain.cal.SeasonYear;

public interface GameService {

	PingpongGame saveGame(PingpongGame game);

	List<PingpongGame> getGames();

	PingpongGame getGame(Long id);

	List<SeasonWeek> getSeasonWeeks(SeasonYear filterBySeason);

	List<CalendarWeek> getCalendarWeeks(SeasonYear year);

	List<PingpongGame> getGamesInSeason(SeasonYear filterBySeason);

	List<PingpongGame> getGamesInSeasonWeek(SeasonWeek seasonWeek);

	List<PingpongGame> getGamesInCalendarWeek(CalendarWeek calendarWeek);

	List<PingpongGame> getGamesForTeam(SeasonYear filterBySeason, PingpongTeam filterByTeam);

	PingpongGame getGameForTeamInSeasonWeek(SeasonWeek week, PingpongTeam team);

	PingpongGame getGameForTeamInCalendarWeek(CalendarWeek week, PingpongTeam team);

	void deleteGame(PingpongGame game);

	SeasonWeek getCurrentSeasonWeek();

	PingpongGame createOrUpdateGame(PingpongGame game);

	void updateScore(SeasonYear year, String vttlId, int homeTeamPts, int outTeamPts, boolean forfait);

}
