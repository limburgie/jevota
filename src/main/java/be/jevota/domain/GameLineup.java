package be.jevota.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class GameLineup {

	@Id @GeneratedValue
	private Long id;

	@OneToOne
	private PingpongGame game;
	
	@OneToOne
	private PingpongTeam team;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private Set<PingpongPlayer> players;

	public boolean isComplete() {
		return players != null && players.size() == getTeamSize();
	}
	
	public int getTeamSize() {
		return team.isRecreation() ? 3 : 4;
	}
	
	public PingpongTeam getOpponent() {
		return game.getOpponent(team);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PingpongGame getGame() {
		return game;
	}

	public void setGame(PingpongGame game) {
		this.game = game;
	}

	public PingpongTeam getTeam() {
		return team;
	}

	public void setTeam(PingpongTeam team) {
		this.team = team;
	}

	public Set<PingpongPlayer> getPlayers() {
		return players;
	}

	public void setPlayers(Set<PingpongPlayer> players) {
		this.players = players;
	}
	
	public List<PingpongPlayer> getPlayerList() {
		List<PingpongPlayer> result = new ArrayList<PingpongPlayer>(players);
		Collections.sort(result, new Comparator<PingpongPlayer>() {
			public int compare(PingpongPlayer p1, PingpongPlayer p2) {
				return p2.getRanking().compareTo(p1.getRanking());
			}
		});
		return result;
	}

}
