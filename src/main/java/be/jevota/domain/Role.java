package be.jevota.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import be.jevota.domain.type.RoleName;

@Entity
public class Role {

	@Id @GeneratedValue
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(unique=true)
	private RoleName name;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<PingpongPlayer> players;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RoleName getName() {
		return name;
	}

	public void setName(RoleName name) {
		this.name = name;
	}

	public List<PingpongPlayer> getPlayers() {
		if(players == null) {
			players = new ArrayList<PingpongPlayer>();
		}
		return players;
	}

	public void setPlayers(List<PingpongPlayer> players) {
		this.players = players;
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
		Role other = (Role) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
