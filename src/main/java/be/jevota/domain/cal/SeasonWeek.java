package be.jevota.domain.cal;

public class SeasonWeek {

	private int weekNo;
	private SeasonYear seasonYear;
	
	public String getLabel() {
		return String.format("Speelweek %s", weekNo);
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
		SeasonWeek other = (SeasonWeek) obj;
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
