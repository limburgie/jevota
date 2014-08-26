package be.jevota.faces.bean;

import be.jevota.domain.PingpongPlayer;
import be.jevota.faces.FacesUtil;
import be.jevota.service.PlayerService;
import be.jevota.service.exception.InvalidEmailException;
import be.jevota.service.exception.InvalidPasswordUpdateException;
import org.joda.time.DateTime;
import org.springframework.context.annotation.Scope;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named @Scope("session")
public class ProfileBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject private LoginBean loginBean;
	@Inject private PlayerService playerService;
	
	private String oldPassword;
	private String newPassword;
	private String repeatNewPassword;

	private Date unavailableDay;
	
	public void save() {
		if(!loginBean.isLoggedIn()) {
			FacesUtil.unauthorizedError();
			return;
		}
		try {
			PingpongPlayer newPlayer = playerService.updateProfile(loginBean.getPlayer());
			loginBean.setPlayer(newPlayer);
			FacesUtil.info("Profiel werd succesvol aangepast!");
		} catch (InvalidEmailException e) {
			FacesUtil.error("Er gebeurde een fout. Contacteer een beheerder.");
		}
	}
	
	public void updatePassword() {
		if(!loginBean.isLoggedIn()) {
			FacesUtil.unauthorizedError();
			return;
		}
		try {
			PingpongPlayer player = playerService.updatePassword(loginBean.getPlayer(), oldPassword, newPassword, repeatNewPassword);
			loginBean.setPlayer(player);
			FacesUtil.info("Wachtwoord werd succesvol aangepast!");
		} catch(InvalidPasswordUpdateException e) {
			FacesUtil.error(e.getMessage());
		}
	}

	public void addUnavailableDay() {
		if (unavailableDay.before(new Date())) {
			FacesUtil.error("Je kan geen dag in het verleden toevoegen.");
			return;
		}
		Date noonDate = new DateTime(unavailableDay).withHourOfDay(12).toDate();
		PingpongPlayer player = loginBean.getPlayer();
		player.getUnavailableDays().add(noonDate);
		playerService.savePlayer(player);
		unavailableDay = null;
		FacesUtil.info("Onbeschikbare dag werd succesvol toegevoegd!");
	}

	public void deleteUnavailableDay(Date day) {
		Date noonDate = new DateTime(day).withHourOfDay(12).toDate();
		PingpongPlayer player = loginBean.getPlayer();
		player.getUnavailableDays().remove(day);
		playerService.savePlayer(player);
		FacesUtil.info("Onbeschikbare dag werd succesvol verwijderd!");
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getRepeatNewPassword() {
		return repeatNewPassword;
	}

	public void setRepeatNewPassword(String repeatNewPassword) {
		this.repeatNewPassword = repeatNewPassword;
	}

	public Date getUnavailableDay() {
		return unavailableDay;
	}

	public void setUnavailableDay(Date unavailableDay) {
		this.unavailableDay = unavailableDay;
	}

}
