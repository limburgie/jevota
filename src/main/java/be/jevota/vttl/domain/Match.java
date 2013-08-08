package be.jevota.vttl.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;


public class Match {

	private String division;
	private String date;
	private String time;
	private String gameId;
	private String homeTeam;
	private String outTeam;

	// Domain logic
	
	public boolean isRecreation() {
		return division.contains("Vrije Tijd");
	}
	
	public Date getJavaDate() {
		try {
			return new SimpleDateFormat("dd-MM-yyHH:mm").parse(date+time);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getDateMySql() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(getJavaDate());
	}
	
	public Team getHomeTeamObj() {
		return getTeamObj(homeTeam);
	}
	
	public Team getOutTeamObj() {
		return getTeamObj(outTeam);
	}
	
	public int getWeekNo() {
		int indexOfSlash = gameId.indexOf("/");
		return Integer.valueOf(gameId.substring(indexOfSlash-2, indexOfSlash));
	}
	
	private Team getTeamObj(String teamStr) {
		Team team = new Team();
		if(teamStr.startsWith("<b>Lanaken")) {
			String realTeam = StringUtils.substringBetween(teamStr, "<b>", "</b>");
			team.setClubNo("LK031");
			team.setClubName("Lanaken");
			team.setTeamNo(StringUtils.split(realTeam, " ")[1]);
		} else {
			String[] teamParts = StringUtils.split(teamStr, " ");
			team.setClubNo(teamParts[0]);
			team.setClubName(teamParts[1]);
			team.setTeamNo(teamParts[teamParts.length-1]);
		}
		team.setRecreation(isRecreation());
		return team;
	}
	
	// Getters and setters
	
	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getOutTeam() {
		return outTeam;
	}

	public void setOutTeam(String outTeam) {
		this.outTeam = outTeam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		result = prime * result + ((outTeam == null) ? 0 : outTeam.hashCode());
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
		Match other = (Match) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (homeTeam == null) {
			if (other.homeTeam != null)
				return false;
		} else if (!homeTeam.equals(other.homeTeam))
			return false;
		if (outTeam == null) {
			if (other.outTeam != null)
				return false;
		} else if (!outTeam.equals(other.outTeam))
			return false;
		return true;
	}

}
