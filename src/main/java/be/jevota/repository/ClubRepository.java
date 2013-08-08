package be.jevota.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import be.jevota.domain.PingpongClub;

public interface ClubRepository extends JpaRepository<PingpongClub, Long> {

	PingpongClub findByNumber(String number);

	@Query("FROM PingpongClub ORDER BY shortName ASC")
	List<PingpongClub> getClubsOrderedByName();
	
}
