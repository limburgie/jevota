package be.jevota.service.impl;

import javax.inject.Named;

import be.jevota.domain.rankingcalc.RankingScore;
import be.jevota.domain.rankingcalc.RankingScoreList;
import be.jevota.domain.type.Ranking;
import be.jevota.service.RankingCalculationService;

@Named
public class RankingCalculationServiceGOFImpl implements RankingCalculationService {

	public Ranking calculateNewRanking(RankingScoreList rankingScoreList) {
		double min = 100d;
		enrichScoreList(rankingScoreList);
		Ranking result = rankingScoreList.getCurrent();
		for(Ranking ranking: Ranking.values()) {
			RankingScore score = rankingScoreList.getScore(ranking);
			if(!score.isEmpty()) {
				double gofSum = getWinDeviations(ranking, rankingScoreList);
				if(gofSum < min && gofSum != 0) {
					min = gofSum;
					result = ranking;
				}
			}
		}
		return result;
	}
	
	private void enrichScoreList(RankingScoreList rankingScoreList) {
		Ranking current = rankingScoreList.getCurrent();
		if(current == null) {
			return;
		}
		Ranking next = current.getNext();
		Ranking previous = current.getPrevious();
		
		RankingScore currentScore = rankingScoreList.getScore(current);
		
		rankingScoreList.setScore(current, currentScore.getWins()+2, currentScore.getLosses()+2);
		if(next != null) {
			RankingScore nextScore = rankingScoreList.getScore(next);
			rankingScoreList.setScore(next, nextScore.getWins()+1, nextScore.getLosses()+3);
		}
		if(previous != null) {
			RankingScore previousScore = rankingScoreList.getScore(previous);
			rankingScoreList.setScore(previous, previousScore.getWins()+3, previousScore.getLosses()+1);
		}
	}

	protected double getWinDeviations(Ranking proposedRanking, RankingScoreList rankingScoreList) {
		double result = 0d;
		for(RankingScore score: rankingScoreList.getScores()) {
			result += getWinDeviationForRanking(score, proposedRanking);
		}
		return result;
	}
	
	protected double getWinDeviationForRanking(RankingScore rankingScore, Ranking self) {
		double expectance = getWinExpectanceForRanking(rankingScore, self);
		if(expectance == 0) {
			return 0;
		}
		return Math.pow(rankingScore.getWins() - expectance, 2)/expectance;
	}
	
	protected double getWinExpectanceForRanking(RankingScore rankingScore, Ranking self) {
		double expectedWinRatio = getExpectedWinRatio(self, rankingScore.getRanking());
		return rankingScore.getCount() * expectedWinRatio;
	}
	
	protected double getExpectedWinRatio(Ranking self, Ranking opponent) {
		int diff = opponent.ordinal() - self.ordinal();
		double ratio = 0.5d;
		for(int i=0; i<Math.abs(diff); i++) {
			ratio *= 0.6d;
		}
		if(diff < 0) {
			ratio = 1d - ratio;
		}
		return ratio;
	}

}
