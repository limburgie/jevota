package be.jevota.vttl.domain;

public class Team {

	private boolean recreation;
	private String clubNo;
	private String clubName;
	private String teamNo;

	// Domain logic
	
	public Club getClubObj() {
		Club club = new Club();
		club.setNumber(clubNo);
		club.setName(clubName);
		return club;
	}
	
	// Getters and setters
	
	public boolean isRecreation() {
		return recreation;
	}
	
	public void setRecreation(boolean recreation) {
		this.recreation = recreation;
	}
	
	public String getClubNo() {
		return clubNo;
	}

	public void setClubNo(String clubNo) {
		this.clubNo = clubNo;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(String teamNo) {
		this.teamNo = teamNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clubNo == null) ? 0 : clubNo.hashCode());
		result = prime * result + (recreation ? 1231 : 1237);
		result = prime * result + ((teamNo == null) ? 0 : teamNo.hashCode());
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
		Team other = (Team) obj;
		if (clubNo == null) {
			if (other.clubNo != null)
				return false;
		} else if (!clubNo.equals(other.clubNo))
			return false;
		if (recreation != other.recreation)
			return false;
		if (teamNo == null) {
			if (other.teamNo != null)
				return false;
		} else if (!teamNo.equals(other.teamNo))
			return false;
		return true;
	}

}
