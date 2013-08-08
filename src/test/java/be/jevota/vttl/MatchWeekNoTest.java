package be.jevota.vttl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.jevota.vttl.domain.Match;

public class MatchWeekNoTest {

	private Match match;
	
	@Before
	public void setup() {
		match = new Match();
	}
	
	@Test
	public void testNormalGameId() {
		match.setGameId("PLKR07/212");
		assertEquals(7, match.getWeekNo());
	}
	
	@Test
	public void testTwoDigits() {
		match.setGameId("PLKR13/212");
		assertEquals(13, match.getWeekNo());
	}
	
	@Test
	public void testShortGameId() {
		match.setGameId("07/085");
		assertEquals(7, match.getWeekNo());
	}
	
}
