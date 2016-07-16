package be.jevota.faces.bean;

import be.jevota.faces.FacesUtil;
import org.springframework.context.annotation.Scope;

import javax.inject.Named;
import java.io.Serializable;

@Named @Scope("view")
public class SendEmailBean implements Serializable {

	private String body;
	private boolean sent;

	public void send() {
		sent = true;
		FacesUtil.info("Mail werd succesvol verstuurd!");
	}

	public boolean isSent() {
		return sent;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
