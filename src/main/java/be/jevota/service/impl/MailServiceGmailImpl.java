package be.jevota.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import javax.inject.Named;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang.StringUtils;

import be.jevota.domain.PingpongPlayer;
import be.jevota.service.MailService;
import be.jevota.service.exception.InvalidEmailException;

@Named
public class MailServiceGmailImpl implements MailService {
	
	private static final String FROM_ADDRESS = "info@jevota.be";
	private static final String FROM_NAME = "T.T.C. Jevota Lanaken";
	private static final String FROM_PASSWORD = "j3vot@4ever";
	
	private static InternetAddress FROM = null;
	{
		try {
			FROM = new InternetAddress(FROM_ADDRESS, FROM_NAME);
		} catch (UnsupportedEncodingException e) {}
	}
	
	public void sendEmail(Collection<PingpongPlayer> recipients, String subject, String body) throws InvalidEmailException {
		sendEmail(recipients, Collections.<PingpongPlayer>emptySet(), subject, body);
	}
	
	public void sendEmail(Collection<PingpongPlayer> recipients, Collection<PingpongPlayer> cc, String subject, String body) throws InvalidEmailException {
		sendEmail(recipients, cc, Collections.<PingpongPlayer>emptySet(), subject, body);
	}

	private InternetAddress[] getAddressesFromPlayers(Collection<PingpongPlayer> players) throws InvalidEmailException {
		List<InternetAddress> result = new ArrayList<InternetAddress>();
		for(PingpongPlayer player: players) {
			if(StringUtils.isBlank(player.getEmailAddress())) {
				throw new InvalidEmailException(player);
			}
			try {
				result.add(new InternetAddress(player.getEmailAddress(), player.getFullName()));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return result.toArray(new InternetAddress[result.size()]);
	}

	public void sendEmail(PingpongPlayer recipient, String subject, String body) throws InvalidEmailException {
		sendEmail(Collections.singleton(recipient), subject, body);
	}

	public void sendEmail(Collection<PingpongPlayer> recipients, Collection<PingpongPlayer> cc, Collection<PingpongPlayer> bcc, String subject, String body) throws InvalidEmailException {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(FROM_ADDRESS, FROM_PASSWORD);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(FROM);
			message.setRecipients(RecipientType.TO, getAddressesFromPlayers(recipients));
			message.setRecipients(RecipientType.CC, getAddressesFromPlayers(cc));
			message.setRecipients(RecipientType.BCC, getAddressesFromPlayers(cc));
			message.setSubject(subject);
			message.setText(body);

			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
