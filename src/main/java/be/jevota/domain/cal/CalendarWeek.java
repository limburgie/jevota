package be.jevota.domain.cal;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public class CalendarWeek {

	private int weekNo;
	private SeasonYear seasonYear;

	public CalendarWeek() {
		weekNo = new DateTime().getWeekOfWeekyear();
		seasonYear = new SeasonYear();
	}

	public String getLabel() {
		return String.format("Week van %s", getMondayOfWeekDateFormatted());
	}

	private Date getMondayOfWeekDate() {
		int year = weekNo > 20 ? seasonYear.getStartYear() : seasonYear.getEndYear();
		DateTime dateTime = new DateTime().withYear(year).withWeekOfWeekyear(weekNo).withDayOfWeek(1);
		return dateTime.toDate();
	}

	private String getMondayOfWeekDateFormatted() {
		return new SimpleDateFormat("dd-MM-yyyy").format(getMondayOfWeekDate());
	}

	public int getWeekNo() {
		return weekNo;
	}

	public void setWeekNo(int weekNo) {
		this.weekNo = weekNo;
	}

	public SeasonYear getSeasonYear() {
		return seasonYear;
	}

	public void setSeasonYear(SeasonYear seasonYear) {
		this.seasonYear = seasonYear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seasonYear == null) ? 0 : seasonYear.hashCode());
		result = prime * result + weekNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalendarWeek other = (CalendarWeek) obj;
		if (seasonYear == null) {
			if (other.seasonYear != null)
				return false;
		} else if (!seasonYear.equals(other.seasonYear))
			return false;
		if (weekNo != other.weekNo)
			return false;
		return true;
	}

}
