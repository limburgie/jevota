package be.jevota.domain.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GetNextPrevRankingTest {

	@Test
	public void getNextForUpperRankingReturnsNull() {
		Ranking current = Ranking.A0;
		assertNull(current.getNext());
		assertEquals(Ranking.A2, current.getPrevious());
	}
	
	@Test
	public void getPreviousForLowestRankingReturnsNull() {
		Ranking current = Ranking.NG;
		assertEquals(Ranking.E6, current.getNext());
		assertNull(current.getPrevious());
		
	}
	
	@Test
	public void getNormalRankingBoundaries() {
		Ranking current = Ranking.E2;
		assertEquals(Ranking.E0, current.getNext());
		assertEquals(Ranking.E4, current.getPrevious());
	}
	
}
