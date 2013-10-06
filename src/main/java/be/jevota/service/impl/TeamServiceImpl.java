package be.jevota.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import be.jevota.domain.PingpongClub;
import be.jevota.domain.PingpongTeam;
import be.jevota.repository.TeamRepository;
import be.jevota.service.ClubService;
import be.jevota.service.TeamService;

@Named
public class TeamServiceImpl implements TeamService {

	@Inject private TeamRepository repo;
	@Inject private ClubService clubService;

	public PingpongTeam getTeam(Long id) {
		return repo.findOne(id);
	}

	public List<PingpongTeam> getJevotaTeams() {
		return repo.findByClubOrderByRecreationAscTeamNoAsc(clubService.getJevotaClub());
	}

	public List<PingpongTeam> getJevotaTeams(boolean recreation) {
		return repo.findByClubAndRecreationOrderByTeamNoAsc(clubService.getJevotaClub(), recreation);
	}
	
	public PingpongTeam getOrCreateTeam(PingpongClub club, String teamNo, boolean recreation) {
		PingpongTeam team = repo.findByClubAndTeamNoAndRecreation(club, teamNo, recreation);
		if(team == null) {
			PingpongTeam newTeam = new PingpongTeam();
			newTeam.setClub(club);
			newTeam.setTeamNo(teamNo);
			newTeam.setRecreation(recreation);
			team = repo.save(newTeam);
		}
		return team;
	}

}
