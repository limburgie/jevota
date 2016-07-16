package be.jevota.domain;

import be.jevota.domain.cal.SeasonYear;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "date", "homeTeam_id", "outTeam_id" }) })
public class PingpongGame {

	@Id @GeneratedValue private Long id;

	private Date date;
	private int weekNo;
	private int homeTeamPts;
	private int outTeamPts;
	private boolean forfait;
	private boolean manual;

	private String vttlId;

	@OneToOne private PingpongTeam homeTeam;

	@OneToOne private PingpongTeam outTeam;

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public SeasonYear getSeasonYear() {
		return new SeasonYear(date);
	}

	public String getVersusString() {
		return String.format("%s - %s", homeTeam.getName(), outTeam.getName());
	}

	public String getScore() {
		return String.format("%s - %s", getHomeTeamPtsLabel(), getOutTeamPtsLabel());
	}

	public boolean isRecreation() {
		return homeTeam.isRecreation();
	}

	public boolean isHomeGame() {
		return homeTeam.isLanaken();
	}

	public PingpongTeam getOpponent(PingpongTeam team) {
		return team.equals(homeTeam) ? outTeam : homeTeam;
	}

	public String getOpponentLabel(PingpongTeam jevotaTeam) {
		return (isHomeGame() ? "Thuis " : "Uit ") + getOpponent(jevotaTeam).getName();
	}

	public String getHomeTeamPtsLabel() {
		return getPointsLabel(homeTeamPts);
	}

	public String getOutTeamPtsLabel() {
		return getPointsLabel(outTeamPts);
	}

	private String getPointsLabel(int points) {
		return points == 0 && forfait ? "FF" : String.valueOf(points);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getWeekNo() {
		return weekNo;
	}

	public void setWeekNo(int weekNo) {
		this.weekNo = weekNo;
	}

	public boolean isInPast() {
		return date != null && date.before(new Date());
	}

	public PingpongTeam getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(PingpongTeam homeTeam) {
		this.homeTeam = homeTeam;
	}

	public PingpongTeam getOutTeam() {
		return outTeam;
	}

	public void setOutTeam(PingpongTeam outTeam) {
		this.outTeam = outTeam;
	}

	public int getHomeTeamPts() {
		return homeTeamPts;
	}

	public void setHomeTeamPts(int homeTeamPts) {
		this.homeTeamPts = homeTeamPts;
	}

	public int getOutTeamPts() {
		return outTeamPts;
	}

	public void setOutTeamPts(int outTeamPts) {
		this.outTeamPts = outTeamPts;
	}

	public boolean isForfait() {
		return forfait;
	}

	public void setForfait(boolean forfait) {
		this.forfait = forfait;
	}

	public String getVttlId() {
		return vttlId;
	}

	public void setVttlId(String vttlId) {
		this.vttlId = vttlId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PingpongGame other = (PingpongGame) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public PingpongTeam getHighestLanakenTeam() {
		if (homeTeam.isLanaken() && !outTeam.isLanaken()) {
			return homeTeam;
		} else if (outTeam.isLanaken()) {
			return outTeam;
		}
		// Both teams are Lanaken
		if (homeTeam.getTeamNo().compareTo(outTeam.getTeamNo()) > 0) {
			return outTeam;
		}
		return homeTeam;
	}

}
