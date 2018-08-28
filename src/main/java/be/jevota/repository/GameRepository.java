package be.jevota.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongTeam;

public interface GameRepository extends JpaRepository<PingpongGame, Long> {

	@Query("FROM PingpongGame WHERE date BETWEEN :startDate AND :endDate ORDER BY date ASC")
	List<PingpongGame> findByDateBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

	@Query("FROM PingpongGame WHERE (homeTeam=:team OR outTeam=:team) AND date BETWEEN :startDate AND :endDate ORDER BY date ASC")
	List<PingpongGame> findByTeamAndDateBetween(@Param("team") PingpongTeam team, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

	@Query("FROM PingpongGame WHERE weekNo=:week AND date BETWEEN :startDate AND :endDate")
	List<PingpongGame> findBySeasonWeek(@Param("week") Integer week, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

	@Query("FROM PingpongGame WHERE weekNo=:week AND (homeTeam=:team OR outTeam=:team) AND date BETWEEN :startDate AND :endDate")
	List<PingpongGame> findByTeamInSeasonWeek(@Param("team") PingpongTeam team, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate, @Param("week") int week);

	@Query("SELECT DISTINCT(weekNo) FROM PingpongGame WHERE date BETWEEN :startDate AND :endDate ORDER BY weekNo ASC")
	List<Integer> findSeasonWeeksBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

	@Query("SELECT weekNo FROM PingpongGame WHERE WEEK(date)=WEEK(:date) ORDER BY COUNT(weekNo) DESC")
	List<Integer> findSeasonWeeksForDate(@Param("date") Date date);

	@Query("SELECT DISTINCT WEEK(date, 3) FROM PingpongGame WHERE date BETWEEN :startDate AND :endDate ORDER BY date ASC")
	List<Integer> findCalendarWeeksBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

	@Query("FROM PingpongGame WHERE WEEK(date, 3)=:week AND date BETWEEN :startDate AND :endDate")
	List<PingpongGame> findByCalendarWeek(@Param("week") Integer week, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

	@Query("FROM PingpongGame WHERE WEEK(date, 3)=:week AND (homeTeam=:team OR outTeam=:team) AND date BETWEEN :startDate AND :endDate")
	List<PingpongGame> findByTeamInCalendarWeek(@Param("team") PingpongTeam team, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate, @Param("week") int week);

	@Query("FROM PingpongGame WHERE homeTeam=:homeTeam AND outTeam=:outTeam AND date BETWEEN :startDate AND :endDate")
	PingpongGame findGameInSeason(@Param("homeTeam") PingpongTeam homeTeam, @Param("outTeam") PingpongTeam outTeam,
			@Param("startDate") Date startDate, @Param("endDate") Date endDate);

	@Query("FROM PingpongGame WHERE vttlId=:vttlId AND date BETWEEN :startDate AND :endDate")
	PingpongGame findGameInSeasonByVttlId(@Param("vttlId") String vttlId, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

}
