package be.jevota.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.jevota.domain.rankingcalc.RankingScoreList;
import be.jevota.domain.type.Ranking;

public class GOFRankingCalculationTest {

	private RankingCalculationServiceGOFImpl rankingCalculator;
	
	@Before
	public void setup() {
		rankingCalculator = new RankingCalculationServiceGOFImpl();
	}
	
	@Test
	public void testGOFSums() {
		RankingScoreList scoreList = new RankingScoreList();
		scoreList.setCurrent(Ranking.D6);
		scoreList.setScore(Ranking.D2, 4, 4);
		scoreList.setScore(Ranking.D4, 11, 4);
		scoreList.setScore(Ranking.D6, 1, 2);
		scoreList.setScore(Ranking.E0, 4, 2);
		scoreList.setScore(Ranking.E2, 2, 1);
		scoreList.setScore(Ranking.E4, 1, 0);
		
		assertEquals(37.28, rankingCalculator.getWinDeviations(Ranking.E0, scoreList), 0.01d);
		assertEquals(14.21, rankingCalculator.getWinDeviations(Ranking.D6, scoreList), 0.01d);
		assertEquals(3.62, rankingCalculator.getWinDeviations(Ranking.D4, scoreList), 0.01d);
		assertEquals(1.46, rankingCalculator.getWinDeviations(Ranking.D2, scoreList), 0.01d);
		assertEquals(2.37, rankingCalculator.getWinDeviations(Ranking.D0, scoreList), 0.01d);
		
		assertEquals(Ranking.D2, rankingCalculator.calculateNewRanking(scoreList));
	}
	
	@Test
	public void testOnlyOneGame() {
		RankingScoreList scoreList = new RankingScoreList();
		scoreList.setCurrent(Ranking.NG);
		scoreList.setScore(Ranking.NG, 1, 0);
		
		assertEquals(Ranking.NG, rankingCalculator.calculateNewRanking(scoreList));
	}
	
	@Test
	public void testOnlyGameInOtherRanking() {
		RankingScoreList scoreList = new RankingScoreList();
		scoreList.setCurrent(Ranking.E2);
		scoreList.setScore(Ranking.NG, 1, 0);
		
		assertEquals(Ranking.E2, rankingCalculator.calculateNewRanking(scoreList));
	}
	
}
