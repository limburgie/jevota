package be.jevota.domain.rankingcalc;

import be.jevota.domain.type.Ranking;

public class RankingScore {

	private Ranking ranking;
	private int wins;
	private int losses;

	public float getWinRatio() {
		return isEmpty() ? 0 : (float)wins/getCount();
	}
	
	public float getLoseRatio() {
		return isEmpty() ? 0 : (float)losses/getCount();
	}
	
	public int getCount() {
		return wins + losses;
	}
	
	public boolean isEmpty() {
		return getCount() == 0;
	}
	
	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

}
