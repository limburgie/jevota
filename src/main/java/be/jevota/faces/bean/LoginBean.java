package be.jevota.faces.bean;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongPlayer;
import be.jevota.faces.FacesUtil;
import be.jevota.service.PlayerService;
import be.jevota.service.exception.InvalidEmailException;
import be.jevota.service.exception.LoginException;

@Named
@Scope("session")
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject private PlayerService playerService;
	@Inject private AccountBean accountBean;

	private PingpongPlayer player;
	private String emailAddress;
	private String password;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void sendNewPasswordLink() throws InvalidEmailException {
		PingpongPlayer player = playerService.getPlayerByEmail(emailAddress);
		if(player == null) {
			FacesUtil.error("Vul een geldig e-mailadres in!");
		} else {
			playerService.sendNewPasswordLink(player);
			FacesUtil.info("Check je email!");
		}
	}
	
	public void login() {
		try {
			player = playerService.login(emailAddress, password);
			accountBean.initializeRoles(player);
			FacesUtil.toHome();
		} catch(LoginException e) {
			FacesUtil.error("Ongeldige login");
		}
	}
	
	public void logout() {
		player = null;
		accountBean.clearRoles();
		FacesUtil.toHome();
	}
	
	public boolean isLoggedIn() {
		return player != null;
	}
	
	public PingpongPlayer getPlayer() {
		return player;
	}
	
	void setPlayer(PingpongPlayer player) {
		this.player = player;
	}
	
}
