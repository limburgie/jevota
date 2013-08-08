package be.jevota.domain.cal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalendarWeekLabelTest {

	private CalendarWeek week;
	
	@Before
	public void setup() {
		week = new CalendarWeek();
		week.setSeasonYear(new SeasonYear(2012));
	}
	
	@Test
	public void testWeekBeforeNewyear() {
		week.setWeekNo(45);
		assertEquals("Week van 05-11-2012", week.getLabel());
	}
	
	@Test
	public void testWeekAfterNewyear() {
		week.setWeekNo(3);
		assertEquals("Week van 14-01-2013", week.getLabel());
	}
	
}
