package be.jevota.test.mother;

import be.jevota.domain.PingpongPlayer;

public class PlayerMother {

	public static PingpongPlayer create(String firstName, String lastName) {
		PingpongPlayer player = new PingpongPlayer();
		player.setFirstName(firstName);
		player.setLastName(lastName);
		return player;
	}
	
}
