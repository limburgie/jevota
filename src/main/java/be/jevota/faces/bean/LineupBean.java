package be.jevota.faces.bean;

import be.jevota.domain.GameLineup;
import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.PingpongTeam;
import be.jevota.faces.FacesUtil;
import be.jevota.faces.bean.filter.CalendarWeekFilterBean;
import be.jevota.faces.bean.filter.SeasonWeekFilterBean;
import be.jevota.service.LineupService;
import be.jevota.service.PlayerService;
import be.jevota.service.TeamService;
import be.jevota.service.exception.InvalidEmailException;
import org.primefaces.component.dnd.Droppable;
import org.primefaces.event.DragDropEvent;
import org.springframework.context.annotation.Scope;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named @Scope("view")
public class LineupBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject private TeamService teamService;
	@Inject private PlayerService playerService;
	@Inject private LineupService lineupService;
	@Inject private LoginBean loginBean;
	
	@Inject private SeasonWeekFilterBean seasonWeekFilterBean;
	@Inject private CalendarWeekFilterBean calendarWeekFilterBean;
	
	private boolean recreation;
	private Map<PingpongTeam, GameLineup> lineups;
	private List<PingpongTeam> teams;
	private List<PingpongPlayer> players;
	private List<PingpongPlayer> filteredPlayers;
	private long playerId;
	
	public List<PingpongTeam> getTeams() {
		if(teams == null) {
			teams = teamService.getJevotaTeams(recreation);
		}
		return teams;
	}
	
	public GameLineup getLineup(long teamId) {
		return getLineups().get(teamService.getTeam(teamId));
	}
	
	public Map<PingpongTeam, GameLineup> getLineups() {
		if(lineups == null) {
			lineups = new HashMap<PingpongTeam, GameLineup>();
			for(PingpongTeam team: getTeams()) {
				lineups.put(team, getLineupForTeam(team));
			}
		}
		return lineups;
	}

	private GameLineup getLineupForTeam(PingpongTeam team) {
		if(seasonWeekFilterBean.getFilter() != null) {
			return lineupService.getOrCreateLineupForTeamInSeasonWeek(team, seasonWeekFilterBean.getFilter());
		} else {
			return lineupService.getOrCreateLineupForTeamInCalendarWeek(team, calendarWeekFilterBean.getFilter());
		}
	}

	public List<PingpongPlayer> getPlayers() {
		if(players == null) {
			players = playerService.getPlayers(recreation);
			for(GameLineup lineup: getLineups().values()) {
				if(lineup != null) {
					players.removeAll(lineup.getPlayers());
				}
			}
		}
		return players;
	}
	
	public void clear() {
		teams = null;
		players = null;
		lineups = null;
	}
	
	public void onPlayerDrop(DragDropEvent event) {
		PingpongPlayer player = (PingpongPlayer) event.getData();
		long teamId = Long.valueOf(((Droppable) event.getSource()).getWidgetVar());
		PingpongTeam team = teamService.getTeam(teamId);
		GameLineup lineup = getLineupForTeam(team);
		lineup.getPlayers().add(player);
		lineup = lineupService.saveLineup(lineup);
		clear();
	}
	
	public void removePlayerFromLineup(long lineupId) {
		GameLineup lineup = lineupService.getLineup(lineupId);
		lineup.setSendDate(null);
		lineup.getPlayers().remove(playerService.getPlayer(playerId));
		lineupService.saveLineup(lineup);
		clear();
	}
	
	public void notifyPlayers(long lineupId) {
		try {
			lineupService.notifyPlayers(loginBean.getPlayer(), lineupId);
			FacesUtil.info("Spelers werden via mail verwittigd");			
		} catch(InvalidEmailException e) {
			FacesUtil.error(e.getPlayer().getFullName()+ " heeft geen geldig e-mailadres");
		}
	}

	public boolean isRecreation() {
		return recreation;
	}

	public void setRecreation(boolean recreation) {
		this.recreation = recreation;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public List<PingpongPlayer> getFilteredPlayers() {
		return filteredPlayers;
	}

	public void setFilteredPlayers(List<PingpongPlayer> filteredPlayers) {
		this.filteredPlayers = filteredPlayers;
	}
	
}
