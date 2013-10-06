package be.jevota.domain.cal;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

public class SeasonYearConstructWithDateTest {

	@Test
	public void ifDateIsInSeptember2013ThenSeason20132014IsConstructed() {
		DateTime dateTime = new DateTime(2013, 9, 5, 12, 0);
		SeasonYear year = new SeasonYear(dateTime.toDate());
		assertEquals(2013, year.getStartYear());
		assertEquals(2014, year.getEndYear());
	}

}
