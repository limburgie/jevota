package be.jevota.service;

import java.util.List;

import be.jevota.domain.PingpongClub;
import be.jevota.domain.PingpongTeam;

public interface TeamService {

	List<PingpongTeam> getJevotaTeams();
	
	PingpongTeam getTeam(Long id);
	
	PingpongTeam getOrCreateTeam(PingpongClub club, String teamNo, boolean recreation);

	List<PingpongTeam> getJevotaTeams(boolean recreation);
	
}
