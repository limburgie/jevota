package be.jevota.domain.cal;

import java.util.Date;

import org.joda.time.DateTime;

public class SeasonYear {

	private int startYear;

	public SeasonYear() {
		this(new Date());
	}

	public SeasonYear(Date date) {
		this(getStartYear(date));
	}

	private static int getStartYear(Date date) {
		DateTime dateTime = new DateTime(date);
		int year = dateTime.getYear();
		if (dateTime.getMonthOfYear() > 7) {
			return year;
		}
		return year - 1;
	}

	public SeasonYear(int startYear) {
		this.startYear = startYear;
	}

	public int getStartYear() {
		return startYear;
	}

	public int getEndYear() {
		return startYear + 1;
	}

	public String getLabel() {
		return getStartYear() + "-" + getEndYear();
	}

	public Date getStartDate() {
		return new DateTime(startYear, 9, 1, 0, 0).toDate();
	}

	public Date getEndDate() {
		return new DateTime(startYear + 1, 6, 1, 0, 0).toDate();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + startYear;
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
		SeasonYear other = (SeasonYear) obj;
		if (startYear != other.startYear)
			return false;
		return true;
	}

}
