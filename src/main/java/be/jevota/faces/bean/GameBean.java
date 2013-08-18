package be.jevota.faces.bean;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.MapModel;
import org.springframework.context.annotation.Scope;

import be.jevota.domain.GameLineup;
import be.jevota.domain.PingpongClub;
import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongTeam;
import be.jevota.faces.FacesUtil;
import be.jevota.faces.bean.filter.GameFilterBean;
import be.jevota.faces.geo.ClubMarkerGenerator;
import be.jevota.faces.geo.exception.CannotCreateMarkerException;
import be.jevota.service.GameService;
import be.jevota.service.LineupService;
import be.jevota.service.TeamService;

@Named
@Scope("view")
public class GameBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject private GameService gameService;
	@Inject private TeamService teamService;
	@Inject private AccountBean accountBean;
	@Inject private GameFilterBean gameFilterBean;
	@Inject private ClubMarkerGenerator markerGenerator;
	@Inject private LineupService lineupService;

	private String redirect;
	private PingpongGame game;
	private Date time;
	private boolean recreation;
	private MapModel mapModel;

	@PostConstruct
	public void init() {
		String gameId = FacesUtil.getRequestParam("gameId");
		redirect = FacesUtil.getRequestParam("redirect");
		if (redirect == null) {
			redirect = "/pages/home.xhtml?faces-redirect=true";
		}
		if (gameId != null) {
			game = gameService.getGame(Long.valueOf(gameId));
			recreation = game.isRecreation();
			time = new Date(game.getDate().getTime());
			mapModel = new DefaultMapModel();
			try {
				mapModel.addOverlay(markerGenerator.generateMarker(game.getHomeTeam().getClub()));
			} catch (CannotCreateMarkerException e) {
			}
		} else {
			game = new PingpongGame();
			game.setHomeTeam(new PingpongTeam());
			game.setOutTeam(new PingpongTeam());
		}
	}

	public GameLineup getHomeLineup() {
		return getLineup(game.getHomeTeam());
	}

	public GameLineup getOutLineup() {
		return getLineup(game.getOutTeam());
	}

	private GameLineup getLineup(PingpongTeam team) {
		return lineupService.getLineupForTeamInGame(team, game);
	}

	public boolean isNewGame() {
		return game.getId() == null;
	}

	public String save() {
		if (!accountBean.isGameMgr()) {
			return FacesUtil.unauthorizedError();
		}
		addTimeToDate();
		setTeamsRecreation();
		gameService.saveGame(game);
		FacesUtil.info("Wedstrijd werd succesvol opgeslagen!");
		return redirect;
	}

	private void setTeamsRecreation() {
		PingpongClub homeClub = game.getHomeTeam().getClub();
		PingpongClub outClub = game.getOutTeam().getClub();
		game.setHomeTeam(teamService.getOrCreateTeam(homeClub, game.getHomeTeam().getTeamNo(), recreation));
		game.setOutTeam(teamService.getOrCreateTeam(outClub, game.getOutTeam().getTeamNo(), recreation));
	}

	public void remove(Long id) {
		PingpongGame game = gameService.getGame(id);
		gameService.deleteGame(game);
		gameFilterBean.getGames().remove(game);
		FacesUtil.info("Wedstrijd werd succesvol verwijderd!");
	}

	private void addTimeToDate() {
		DateTime gameDateTime = new DateTime(game.getDate());
		LocalTime localTime = new LocalTime(time);
		gameDateTime = gameDateTime.withHourOfDay(localTime.getHourOfDay());
		gameDateTime = gameDateTime.withMinuteOfHour(localTime.getMinuteOfHour());
		gameDateTime = gameDateTime.withSecondOfMinute(0);
		game.setDate(gameDateTime.toDate());
	}

	public void toGame() {
		FacesUtil.redirect("/pages/game.jsf?gameId=" + game.getId());
	}

	public PingpongGame getGame() {
		return game;
	}

	public void setGame(PingpongGame game) {
		this.game = game;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public boolean isRecreation() {
		return recreation;
	}

	public void setRecreation(boolean recreation) {
		this.recreation = recreation;
	}

	public MapModel getMapModel() {
		return mapModel;
	}

}
