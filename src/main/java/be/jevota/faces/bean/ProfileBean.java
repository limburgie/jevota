package be.jevota.faces.bean;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongPlayer;
import be.jevota.faces.FacesUtil;
import be.jevota.service.PlayerService;
import be.jevota.service.exception.InvalidEmailException;
import be.jevota.service.exception.InvalidPasswordUpdateException;

@Named @Scope("session")
public class ProfileBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject private LoginBean loginBean;
	@Inject private PlayerService playerService;
	
	private String oldPassword;
	private String newPassword;
	private String repeatNewPassword;
	
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
	
}
