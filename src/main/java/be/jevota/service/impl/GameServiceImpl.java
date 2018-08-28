package be.jevota.service.impl;

import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongTeam;
import be.jevota.domain.cal.CalendarWeek;
import be.jevota.domain.cal.SeasonWeek;
import be.jevota.domain.cal.SeasonYear;
import be.jevota.repository.GameRepository;
import be.jevota.service.GameService;
import be.jevota.service.comparator.GameByTeamComparator;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Named
public class GameServiceImpl implements GameService {

	private static final Sort ORDER_BY_DATE_DESC = new Sort(new Sort.Order(Direction.DESC, "date"));

	@Inject private GameRepository gameRepo;

	@Inject private GameByTeamComparator comparator;

	public PingpongGame getGame(Long id) {
		return gameRepo.findOne(id);
	}

	public List<PingpongGame> getGames() {
		return gameRepo.findAll(ORDER_BY_DATE_DESC);
	}

	@Transactional
	public PingpongGame saveGame(PingpongGame game) {
		game.setManual(true);
		return gameRepo.save(game);
	}

	public List<PingpongGame> getGamesInSeason(SeasonYear year) {
		return gameRepo.findByDateBetween(year.getStartDate(), year.getEndDate());
	}

	public List<PingpongGame> getGamesInSeasonWeek(SeasonWeek seasonWeek) {
		if (seasonWeek == null) {
			return Collections.emptyList();
		}
		SeasonYear year = seasonWeek.getSeasonYear();
		List<PingpongGame> games = gameRepo.findBySeasonWeek(seasonWeek.getWeekNo(), year.getStartDate(),
				year.getEndDate());
		Collections.sort(games, comparator);
		return games;
	}

	public List<PingpongGame> getGamesInCalendarWeek(CalendarWeek calendarWeek) {
		int weekNo = calendarWeek.getWeekNo();
		SeasonYear year = calendarWeek.getSeasonYear();
		List<PingpongGame> games = gameRepo.findByCalendarWeek(weekNo, year.getStartDate(), year.getEndDate());
		Collections.sort(games, comparator);
		return games;
	}

	public List<CalendarWeek> getCalendarWeeks(SeasonYear year) {
		List<CalendarWeek> result = new ArrayList<CalendarWeek>();
		for (Integer weekNo : gameRepo.findCalendarWeeksBetween(year.getStartDate(), year.getEndDate())) {
			CalendarWeek week = new CalendarWeek();
			week.setWeekNo(weekNo);
			week.setSeasonYear(year);
			result.add(week);
		}
		return result;
	}

	public List<PingpongGame> getGamesForTeam(SeasonYear year, PingpongTeam team) {
		return gameRepo.findByTeamAndDateBetween(team, year.getStartDate(), year.getEndDate());
	}

	public PingpongGame getGameForTeamInSeasonWeek(SeasonWeek week, PingpongTeam team) {
		SeasonYear year = week.getSeasonYear();
		List<PingpongGame> games = gameRepo.findByTeamInSeasonWeek(team, year.getStartDate(), year.getEndDate(), week.getWeekNo());
		return games.isEmpty() ? null : games.get(0);
	}

	@Override
	public PingpongGame getGameForTeamInCalendarWeek(CalendarWeek week, PingpongTeam team) {
		SeasonYear year = week.getSeasonYear();
		List<PingpongGame> games = gameRepo.findByTeamInCalendarWeek(team, year.getStartDate(), year.getEndDate(), week.getWeekNo());
		return games.isEmpty() ? null : games.get(0);
	}

	public List<SeasonWeek> getSeasonWeeks(SeasonYear year) {
		List<Integer> weekNos = gameRepo.findSeasonWeeksBetween(year.getStartDate(), year.getEndDate());
		List<SeasonWeek> result = new ArrayList<SeasonWeek>();
		for (Integer weekNo : weekNos) {
			SeasonWeek week = new SeasonWeek();
			week.setSeasonYear(year);
			week.setWeekNo(weekNo);
			result.add(week);
		}
		return result;
	}

	@Transactional
	public void deleteGame(PingpongGame game) {
		gameRepo.delete(game);
	}

	public SeasonWeek getCurrentSeasonWeek() {
		List<Integer> weekNos = gameRepo.findSeasonWeeksForDate(new Date());
		SeasonWeek week = new SeasonWeek();
		week.setSeasonYear(new SeasonYear());
		week.setWeekNo(weekNos.isEmpty() ? null : weekNos.get(0));
		return week;
	}

	@Transactional
	public PingpongGame createOrUpdateGame(PingpongGame game) {
		PingpongGame result = getSeasonGame(game.getSeasonYear(), game.getVttlId());
		if (result == null) {
			return gameRepo.save(game);
		}
		if (!result.isManual()) {
			result.setWeekNo(game.getWeekNo());
			result.setDate(game.getDate());
			return gameRepo.save(result);
		}
		return result;
	}

	private PingpongGame getSeasonGame(SeasonYear year, String vttlId) {
		return gameRepo.findGameInSeasonByVttlId(vttlId, year.getStartDate(), year.getEndDate());
	}

	@Transactional
	public void updateScore(SeasonYear year, String vttlId, int homeTeamPts, int outTeamPts, boolean forfait) {
		PingpongGame game = getSeasonGame(year, vttlId);
		if (!game.isRecreation() && !game.isManual()) {
			game.setHomeTeamPts(homeTeamPts);
			game.setOutTeamPts(outTeamPts);
			game.setForfait(forfait);
			gameRepo.save(game);
		}
	}

}
