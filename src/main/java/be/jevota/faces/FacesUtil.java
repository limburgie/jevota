package be.jevota.faces;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class FacesUtil {
	
	public static void error(String msg) {
		message(msg, FacesMessage.SEVERITY_ERROR);
	}
	
	public static void info(String msg) {
		message(msg, FacesMessage.SEVERITY_INFO);
	}
	
	public static void error(String clientId, String msg) {
		message(clientId, msg, FacesMessage.SEVERITY_ERROR);
	}
	
	public static void info(String clientId, String msg) {
		message(clientId, msg, FacesMessage.SEVERITY_INFO);
	}
	
	public static String getRequestParam(String name) {
		return ec().getRequestParameterMap().get(name);
	}

	public static void unexpectedError(Exception e) {
		error("Er is een onverwachte fout opgetreden. Contacteer de webmaster.");
		e.printStackTrace();
	}
	
	public static String unauthorizedError() {
		error("Je mag deze actie niet uitvoeren. Gelieve eerst in te loggen.");
		return toHome();
	}
	
	public static String toHome() {
		return "/pages/home.xhtml?faces-redirect=true";
	}
	
	public static void redirect(String url) {
		try {
			if(url == null) {
				return;
			}
			if(!url.startsWith("http")) {
				url = getRequest().getContextPath() + url;
			}
			ec().redirect(url);
		} catch (IOException e) {
			unexpectedError(e);
		}
	}
	
	private static HttpServletRequest getRequest() {
		return (HttpServletRequest) ec().getRequest();
	}

	private static ExternalContext ec() {
		return fc().getExternalContext();
	}
	
	private static void message(String msg, Severity severity) {
		message(null, msg, severity);
	}
	
	private static void message(String clientId, String msg, Severity severity) {
		fc().addMessage(clientId, new FacesMessage(severity, msg, msg));
	}
	
	private static FacesContext fc() {
		return FacesContext.getCurrentInstance();
	}
	
}
