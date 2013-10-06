package be.jevota.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.jevota.domain.type.Ranking;
import be.jevota.service.impl.RankingCalculationServiceGOFImpl;

public class GOFExpectedWinRatioTest {

	private RankingCalculationServiceGOFImpl rankingCalculator;
	
	@Before
	public void setup() {
		rankingCalculator = new RankingCalculationServiceGOFImpl();
	}
	
	@Test
	public void testEqual() {
		assertEquals(0.5d, rankingCalculator.getExpectedWinRatio(Ranking.E6, Ranking.E6), 0.1d);
	}
	
	@Test
	public void testAgainstBetterRanking() {
		assertEquals(0.18d, rankingCalculator.getExpectedWinRatio(Ranking.E0, Ranking.D4), 0.1d);
	}
	
	@Test
	public void testAgainstWorseRanking() {
		assertEquals(0.7d, rankingCalculator.getExpectedWinRatio(Ranking.E0, Ranking.E2), 0.1d);
	}
	
}
