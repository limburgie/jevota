package be.jevota.service.comparator;

import java.util.Comparator;

import javax.inject.Named;

import be.jevota.domain.PingpongGame;

@Named
public class GameByTeamComparator implements Comparator<PingpongGame> {

	public int compare(PingpongGame game1, PingpongGame game2) {
		int result = Boolean.valueOf(game1.isRecreation()).compareTo(game2.isRecreation());
		if (result != 0) {
			return result;
		}
		return game1.getHighestLanakenTeam().getTeamNo().compareTo(game2.getHighestLanakenTeam().getTeamNo());
	}

}
