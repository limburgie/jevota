package be.jevota.test.mother;

import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongTeam;

public class GameMother {

	public static PingpongGame create(long id, PingpongTeam team1, PingpongTeam team2) {
		PingpongGame game = new PingpongGame();
		game.setId(id);
		game.setHomeTeam(team1);
		game.setOutTeam(team2);
		return game;
	}
	
}
