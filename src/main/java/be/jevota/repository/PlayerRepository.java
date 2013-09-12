package be.jevota.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import be.jevota.domain.PingpongPlayer;

public interface PlayerRepository extends JpaRepository<PingpongPlayer, Long> {

	List<PingpongPlayer> findByActiveOrderByRankingAscLastNameAsc(boolean active);

	List<PingpongPlayer> findByActiveAndMaleOrderByRankingAscLastNameAsc(boolean active, boolean male);

	PingpongPlayer findByEmailAddress(String emailAddress);

	List<PingpongPlayer> findByActiveOrderByMemberNoDesc(boolean active);

	@Query("FROM PingpongPlayer WHERE firstName LIKE CONCAT('%',:name,'%') OR lastName LIKE CONCAT('%',:name,'%') ORDER BY lastName ASC, firstName ASC")
	List<PingpongPlayer> searchByName(@Param("name") String name);

	List<PingpongPlayer> findByActiveAndRecreationOrderByRankingAscLastNameAsc(boolean active, boolean recreation);

	@Query("FROM PingpongPlayer WHERE emailAddress IS NOT NULL AND emailAddress <> '' AND (password='' OR password IS NULL)")
	List<PingpongPlayer> getPlayersWithEmailWithoutPassword();

}
