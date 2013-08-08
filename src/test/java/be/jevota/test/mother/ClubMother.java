package be.jevota.test.mother;

import be.jevota.domain.PingpongClub;

public class ClubMother {

	public static PingpongClub create(String name) {
		PingpongClub club = new PingpongClub();
		club.setName(name);
		return club;
	}
	
}
