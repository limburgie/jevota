package be.jevota.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import be.jevota.domain.PingpongClub;
import be.jevota.domain.PingpongTeam;

public interface TeamRepository extends JpaRepository<PingpongTeam, Long> {
	
	List<PingpongTeam> findByClubOrderByRecreationAscTeamNoAsc(PingpongClub club);

	PingpongTeam findByClubAndTeamNoAndRecreation(PingpongClub club, String teamNo, boolean recreation);

	List<PingpongTeam> findByClubAndRecreationOrderByTeamNoAsc(PingpongClub jevotaClub, boolean recreation);

}
