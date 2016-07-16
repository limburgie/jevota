package be.jevota.faces.bean;

import be.jevota.faces.FacesUtil;
import be.jevota.service.PlayerService;
import org.springframework.context.annotation.Scope;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named @Scope("view")
public class SendEmailBean implements Serializable {

	@Inject private PlayerService playerService;

	private String subject;
	private String body;
	private boolean sent;

	public void send() {
		int count = playerService.sendMailToAll(subject, body);
		sent = count > 0;
		FacesUtil.info(String.format("Mail werd succesvol verstuurd naar %s leden!", count));
	}

	public boolean isSent() {
		return sent;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
