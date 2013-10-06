package be.jevota.vttl.domain;

import java.util.HashSet;
import java.util.Set;

public class Season {

	private static final String INSERT_CLUB_FORMAT = "INSERT INTO PingpongClub (number, shortName, name) VALUES ('%s', '%s', '%s');";
	private static final String INSERT_TEAM_FORMAT = "INSERT INTO PingpongTeam (club_id, teamNo, recreation) VALUES ((SELECT id from PingpongClub where number='%s' LIMIT 1), '%s', %s);";
	private static final String INSERT_MATCH_FORMAT = "INSERT INTO PingpongGame (`date`, `weekNo`, `homeTeam_id`, `outTeam_id`) VALUES ('%s', %s, "+
			"(SELECT t.id FROM PingpongTeam t, PingpongClub c WHERE t.club_id=c.id AND c.`number`='%s' AND t.`teamNo`='%s' AND t.recreation=%s LIMIT 1), "+
			"(SELECT t.id FROM PingpongTeam t, PingpongClub c WHERE t.club_id=c.id AND c.`number`='%s' AND t.`teamNo`='%s' AND t.recreation=%s LIMIT 1));";
	
	private Set<Match> matches;

	// Domain logic

	public Set<Club> getClubs() {
		Set<Club> clubs = new HashSet<Club>();
		for(Team team: getTeams()) {
			clubs.add(team.getClubObj());
		}
		return clubs;
	}
	
	public Set<Team> getTeams() {
		Set<Team> teams = new HashSet<Team>();
		for (Match match : matches) {
			teams.add(match.getHomeTeamObj());
			teams.add(match.getOutTeamObj());
		}
		return teams;
	}
	
	public String getSql() {
		StringBuilder sb = new StringBuilder();
		for(Club club: getClubs()) {
			sb.append(String.format(INSERT_CLUB_FORMAT, club.getShortNumber(), club.getName(), club.getName())).append("\n");
		}
		for(Team team: getTeams()) {
			sb.append(String.format(INSERT_TEAM_FORMAT, team.getClubObj().getShortNumber(), team.getTeamNo(), team.isRecreation()?"1":"0")).append("\n");
		}
		for(Match match: getMatches()) {
			Team homeTeam = match.getHomeTeamObj();
			Team outTeam = match.getOutTeamObj();
			sb.append(String.format(INSERT_MATCH_FORMAT, 
					match.getDateMySql(), match.getWeekNo(),
					homeTeam.getClubObj().getShortNumber(), homeTeam.getTeamNo(), homeTeam.isRecreation()?"1":"0",
					outTeam.getClubObj().getShortNumber(), outTeam.getTeamNo(), outTeam.isRecreation()?"1":"0")).append("\n");
		}
		return sb.toString();
	}

	// Getters and setters

	public Set<Match> getMatches() {
		return matches;
	}

	public void setMatches(Set<Match> matches) {
		this.matches = matches;
	}

}
