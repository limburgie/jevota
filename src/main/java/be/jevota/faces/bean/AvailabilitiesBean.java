package be.jevota.faces.bean;

import be.jevota.domain.PingpongPlayer;
import be.jevota.faces.FacesUtil;
import be.jevota.service.PlayerService;
import org.springframework.context.annotation.Scope;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Named @Scope("view")
public class AvailabilitiesBean implements Serializable {

	@Inject private PlayerService playerService;

	private List<PingpongPlayer> players;
	private PingpongPlayer player;
	private Date unavailableDay;

	public void addUnavailableDay() {
		if (unavailableDay.before(new Date())) {
			FacesUtil.error("Je kan geen dag in het verleden toevoegen.");
			return;
		}
		player.addUnavailableDay(unavailableDay);
		playerService.savePlayer(player);
		player = playerService.getPlayer(player.getId());
		unavailableDay = null;
		FacesUtil.info("Onbeschikbare dag werd succesvol toegevoegd!");
	}

	public void deleteUnavailableDay(Date day) {
		player.removeUnavailableDay(day);
		playerService.savePlayer(player);
		player = playerService.getPlayer(player.getId());
		FacesUtil.info("Onbeschikbare dag werd succesvol verwijderd!");
	}

	public List<PingpongPlayer> getPlayers() {
		if (players == null) {
			players = playerService.getActivePlayers(false);
		}
		return players;
	}

	public PingpongPlayer getPlayer() {
		return player;
	}

	public void setPlayer(PingpongPlayer player) {
		this.player = player;
	}

	public Date getUnavailableDay() {
		return unavailableDay;
	}

	public void setUnavailableDay(Date unavailableDay) {
		this.unavailableDay = unavailableDay;
	}

}
