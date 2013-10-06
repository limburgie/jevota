package be.jevota.domain.rankingcalc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RankingScoreWinLoseRatioTest {

	private RankingScore score;
	
	@Before
	public void setup() {
		score = new RankingScore();
	}
	
	@Test
	public void testNoGamesPlayedGivesZeroRatio() {
		assertEquals(0, score.getWinRatio(), .01d);
		assertEquals(0, score.getLoseRatio(), .01d);
	}
	
	@Test
	public void testFiftyFifty() {
		score.setWins(5);
		score.setLosses(5);
		
		assertEquals(.5d, score.getWinRatio(), .01d);
		assertEquals(.5d, score.getLoseRatio(), .01d);
	}
	
	@Test
	public void testThirtySeventy() {
		score.setWins(3);
		score.setLosses(7);
		
		assertEquals(.3d, score.getWinRatio(), .01d);
		assertEquals(.7d, score.getLoseRatio(), .01d);
	}
	
}
