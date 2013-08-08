package be.jevota.test.mother;

import be.jevota.domain.PingpongClub;
import be.jevota.domain.PingpongTeam;
import be.jevota.service.ClubService;

public class TeamMother {

	public static PingpongTeam create(boolean lanaken, String teamNo, boolean recreation) {
		PingpongTeam team = new PingpongTeam();
		PingpongClub club = new PingpongClub();
		if(lanaken) {
			club.setNumber(ClubService.JEVOTA_NUMBER);
		} else {
			club.setNumber("011");
		}
		team.setClub(club);
		team.setTeamNo(teamNo);
		team.setRecreation(recreation);
		return team;
	}
	
}
