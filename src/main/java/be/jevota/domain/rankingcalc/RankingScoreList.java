package be.jevota.domain.rankingcalc;

import java.util.ArrayList;
import java.util.List;

import be.jevota.domain.type.Ranking;

public class RankingScoreList {

	private Ranking current;
	private final List<RankingScore> scores;
	
	public RankingScoreList() {
		scores = new ArrayList<RankingScore>();
		for(Ranking ranking: Ranking.values()) {
			RankingScore score = new RankingScore();
			score.setRanking(ranking);
			scores.add(score);
		}
	}
	
	public void setScore(Ranking ranking, int wins, int losses) {
		RankingScore score = getScore(ranking);
		if(score != null) {
			score.setWins(wins);
			score.setLosses(losses);
		}
	}
	
	public RankingScore getScore(Ranking ranking) {
		for(RankingScore score: scores) {
			if(score.getRanking() == ranking) {
				return score;
			}
		}
		return null;
	}
	
	public int getTotalGamesPlayed() {
		int total = 0;
		for(RankingScore score: scores) {
			total += score.getWins();
			total += score.getLosses();
		}
		return total;
	}

	public void reset() {
		current = null;
		for(Ranking ranking: Ranking.values()) {
			setScore(ranking, 0, 0);
		}
	}

	public Ranking getCurrent() {
		return current;
	}

	public void setCurrent(Ranking current) {
		this.current = current;
	}

	public List<RankingScore> getScores() {
		return scores;
	}

}
