package be.jevota.service;

import java.util.Collection;

import be.jevota.domain.PingpongPlayer;
import be.jevota.service.exception.InvalidEmailException;

public interface MailService {

	void sendEmail(Collection<PingpongPlayer> recipients, Collection<PingpongPlayer> cc, String subject, String body,
			boolean jevotaCopy) throws InvalidEmailException;

	void sendEmail(Collection<PingpongPlayer> recipients, Collection<PingpongPlayer> cc,
			Collection<PingpongPlayer> bcc, String subject, String body, boolean jevotaCopy)
			throws InvalidEmailException;

	void sendEmail(Collection<PingpongPlayer> recipients, String subject, String body, boolean jevotaCopy)
			throws InvalidEmailException;

	void sendEmail(PingpongPlayer recipient, String subject, String body, boolean jevotaCopy)
			throws InvalidEmailException;

}
