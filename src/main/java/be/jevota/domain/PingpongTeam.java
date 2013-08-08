package be.jevota.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints={
	@UniqueConstraint(columnNames={"club_id", "teamNo", "recreation"})
})
public class PingpongTeam {

	@Id @GeneratedValue
	private Long id;
	
	@OneToOne
	private PingpongClub club;
	
	private String teamNo;
	private boolean recreation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PingpongClub getClub() {
		return club;
	}

	public void setClub(PingpongClub club) {
		this.club = club;
	}
	
	public String getName() {
		return String.format("%s %s", club.getShortName(), getTeamName());
	}
	
	public String getTeamName() {
		return String.format("%s%s", recreation ? "REC " : "", teamNo);
	}

	public String getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(String teamNo) {
		this.teamNo = teamNo;
	}

	public boolean isRecreation() {
		return recreation;
	}

	public void setRecreation(boolean recreation) {
		this.recreation = recreation;
	}
	
	public boolean isLanaken() {
		return club.isLanaken();
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
		PingpongTeam other = (PingpongTeam) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
