package be.jevota.faces.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.MapModel;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;

import be.jevota.domain.PingpongPlayer;
import be.jevota.faces.FacesUtil;
import be.jevota.faces.geo.PlayerMarkerGenerator;
import be.jevota.faces.geo.exception.CannotCreateMarkerException;
import be.jevota.service.PlayerService;
import be.jevota.service.exception.InvalidEmailException;

@Named @Scope("view")
public class PlayerBean implements Serializable, Converter {

	private static final long serialVersionUID = 1L;
	
	@Inject private PlayerService playerService;
	@Inject private AccountBean accountBean;
	@Inject private PlayerMarkerGenerator markerGenerator;
	
	private String redirect;
	private boolean maleOnly;
	private PingpongPlayer player;
	private List<PingpongPlayer> activePlayers;
	private List<PingpongPlayer> newPlayers;
	private List<PingpongPlayer> allPlayers;
	private List<PingpongPlayer> filteredPlayers;
	private MapModel mapModel;

	@PostConstruct
	public void init() {
		String playerId = FacesUtil.getRequestParam("playerId");
		redirect = FacesUtil.getRequestParam("redirect");
		if (playerId != null) {
			player = playerService.getPlayer(Long.valueOf(playerId));
			mapModel = new DefaultMapModel();
			try {
				mapModel.addOverlay(markerGenerator.generateMarker(player));
			} catch (CannotCreateMarkerException e) {}
		} else {
			player = new PingpongPlayer();
		}
	}
	
	public List<PingpongPlayer> getNewPlayers() {
		if(newPlayers == null) {
			newPlayers = playerService.getNewPlayers();
		}
		return newPlayers;
	}
	
	public List<PingpongPlayer> completePlayer(String query) {
		return playerService.searchByName(query);
	}
	
	public boolean isNewPlayer() {
		return player.getId() == null;
	}
	
	public List<PingpongPlayer> getActivePlayers() {
		if(activePlayers == null) {
			initActivePlayers();
		}
		return activePlayers;
	}

	public void initActivePlayers() {
		activePlayers = playerService.getActivePlayers(maleOnly);
	}
	
	public List<PingpongPlayer> getAllPlayers() {
		if(allPlayers == null) {
			allPlayers = playerService.getPlayers();
		}
		return allPlayers;
	}
	
	public void toPlayer() {
		FacesUtil.redirect("/pages/player.jsf?playerId="+player.getId());
	}
	
	public String save() {
		if(!accountBean.isPlayerMgr()) {
			return FacesUtil.unauthorizedError();
		}
		try {
			playerService.savePlayer(player);
			FacesUtil.info("Speler werd succesvol opgeslagen!");
			return redirect;
		} catch(DataIntegrityViolationException e) {
			FacesUtil.error("Er bestaat al een speler met hetzelfde lidnummer of emailadres!");
			return null;
		}
	}
	
	public void sendNewPassword() {
		if(!accountBean.isPlayerMgr()) {
			FacesUtil.unauthorizedError();
		}
		try {
			playerService.generateAndEmailNewPassword(player);
			FacesUtil.info("Nieuw wachtwoord werd gegenereerd en doorgestuurd naar "+player.getEmailAddress());
		} catch(InvalidEmailException e) {
			FacesUtil.error(player.getFullName() + " heeft geen geldig e-mailadres");
		}
	}
	
	public void sendNewPasswordAll() {
		if(!accountBean.isAdmin()) {
			FacesUtil.unauthorizedError();
		}
		int count = playerService.generateAndEmailNewPasswords();
		FacesUtil.info("Nieuw wachtwoord werd gegenereerd en doorgestuurd naar "+count+" spelers");
	}
	
	public boolean isMaleOnly() {
		return maleOnly;
	}

	public void setMaleOnly(boolean maleOnly) {
		this.maleOnly = maleOnly;
	}

	public PingpongPlayer getPlayer() {
		return player;
	}

	public void setPlayer(PingpongPlayer player) {
		this.player = player;
	}
	
	public MapModel getMapModel() {
		return mapModel;
	}
	
	public List<PingpongPlayer> getFilteredPlayers() {
		return filteredPlayers;
	}

	public void setFilteredPlayers(List<PingpongPlayer> filteredPlayers) {
		this.filteredPlayers = filteredPlayers;
	}

	public PingpongPlayer getAsObject(FacesContext context, UIComponent component, String value) {
		if(StringUtils.isBlank(value)) {
			return null;
		}
		return playerService.getPlayer(Long.valueOf(value));
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null) {
			return StringUtils.EMPTY;
		}
		return String.valueOf(((PingpongPlayer)value).getId());
	}
	
}
