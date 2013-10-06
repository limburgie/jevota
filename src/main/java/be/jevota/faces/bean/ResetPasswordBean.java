package be.jevota.faces.bean;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.math.NumberUtils;
import org.springframework.context.annotation.Scope;

import be.jevota.faces.FacesUtil;
import be.jevota.service.PlayerService;
import be.jevota.service.exception.InvalidEmailException;

@Named @Scope("view")
public class ResetPasswordBean {

	@Inject private PlayerService playerService;
	
	private boolean done;
	private int memberNo;
	private long id;
	
	@PostConstruct
	public void init() {
		memberNo = NumberUtils.toInt(FacesUtil.getRequestParam("m"));
		id = NumberUtils.toLong(FacesUtil.getRequestParam("i"));
	}
	
	public void reset() throws InvalidEmailException {
		playerService.generateAndEmailNewPassword(id, memberNo);
		FacesUtil.info("Je wachtwoord werd gereset en het nieuwe wachtwoord werd naar je doorgemaild.");
		done = true;
	}
	
	public boolean isDone() {
		return done;
	}
	
}
