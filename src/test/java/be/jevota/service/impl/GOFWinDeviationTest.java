package be.jevota.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.jevota.domain.rankingcalc.RankingScore;
import be.jevota.domain.type.Ranking;

public class GOFWinDeviationTest {

	private RankingCalculationServiceGOFImpl rankingCalculator;
	private RankingScore rankingScore;
	
	@Before
	public void setup() {
		rankingCalculator = new RankingCalculationServiceGOFImpl();
	}
	
	@Test
	public void testAgainstNonePlayed() {
		rankingScore = new RankingScore();
		rankingScore.setRanking(Ranking.E2);
		assertEquals(0, rankingCalculator.getWinDeviationForRanking(rankingScore, Ranking.B2), 0.01d);
	}
	
	@Test
	public void testWinDeviations() {
		rankingScore = new RankingScore();
		rankingScore.setRanking(Ranking.E0);
		rankingScore.setWins(4);
		rankingScore.setLosses(2);
		
		assertEquals(0.33d, rankingCalculator.getWinDeviationForRanking(rankingScore, Ranking.E0), 0.01d);
		assertEquals(0.009d, rankingCalculator.getWinDeviationForRanking(rankingScore, Ranking.D6), 0.01d);
		assertEquals(0.17d, rankingCalculator.getWinDeviationForRanking(rankingScore, Ranking.D4), 0.01d);
		assertEquals(0.34d, rankingCalculator.getWinDeviationForRanking(rankingScore, Ranking.D2), 0.01d);
		assertEquals(0.46d, rankingCalculator.getWinDeviationForRanking(rankingScore, Ranking.D0), 0.01d);
	}
	
}
