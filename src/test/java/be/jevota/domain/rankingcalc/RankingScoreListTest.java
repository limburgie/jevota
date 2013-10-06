package be.jevota.domain.rankingcalc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.jevota.domain.type.Ranking;

public class RankingScoreListTest {

	private RankingScoreList scoreList;
	
	@Before
	public void setup() {
		scoreList = new RankingScoreList();
	}
	
	@Test
	public void testDefaultZeroGames() {
		assertEquals(0, scoreList.getTotalGamesPlayed());
	}
	
	@Test
	public void testAmountOfGames() {
		scoreList.setScore(Ranking.E6, 2, 3);
		scoreList.setScore(Ranking.E4, 5, 0);
		assertEquals(10, scoreList.getTotalGamesPlayed());
	}
	
}
