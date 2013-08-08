package be.jevota.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.jevota.domain.rankingcalc.RankingScore;
import be.jevota.domain.type.Ranking;
import be.jevota.service.impl.RankingCalculationServiceGOFImpl;

public class GOFWinExpectanceTest {

	private RankingCalculationServiceGOFImpl rankingCalculator;
	
	@Before
	public void setup() {
		rankingCalculator = new RankingCalculationServiceGOFImpl();
	}
	
	@Test
	public void testNonExistent() {
		RankingScore rankingScore = new RankingScore();
		rankingScore.setRanking(Ranking.D0);
		
		assertEquals(0, rankingCalculator.getWinExpectanceForRanking(rankingScore, Ranking.D2), 0.1d);
	}
	
	@Test
	public void testd2() {
		RankingScore rankingScore = new RankingScore();
		rankingScore.setRanking(Ranking.D2);
		rankingScore.setWins(4);
		rankingScore.setLosses(4);
		assertEquals(1.44d, rankingCalculator.getWinExpectanceForRanking(rankingScore, Ranking.D6), 0.1d);
		assertEquals(2.4d, rankingCalculator.getWinExpectanceForRanking(rankingScore, Ranking.D4), 0.1d);
		assertEquals(4d, rankingCalculator.getWinExpectanceForRanking(rankingScore, Ranking.D2), 0.1d);
	}
	
	@Test
	public void testd4() {
		RankingScore rankingScore = new RankingScore();
		rankingScore.setRanking(Ranking.D4);
		rankingScore.setWins(11);
		rankingScore.setLosses(4);
		assertEquals(4.5d, rankingCalculator.getWinExpectanceForRanking(rankingScore, Ranking.D6), 0.1d);
		assertEquals(7.5d, rankingCalculator.getWinExpectanceForRanking(rankingScore, Ranking.D4), 0.1d);
		assertEquals(10.5d, rankingCalculator.getWinExpectanceForRanking(rankingScore, Ranking.D2), 0.1d);
		
	}
	
}
