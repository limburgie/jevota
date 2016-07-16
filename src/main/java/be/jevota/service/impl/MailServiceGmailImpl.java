package be.jevota.service.impl;

import be.jevota.domain.PingpongPlayer;
import be.jevota.service.MailService;
import be.jevota.service.exception.InvalidEmailException;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import javax.inject.Named;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.*;

@Named
public class MailServiceGmailImpl implements MailService {

	private static final String JEVOTA_HOME_ADDRESS = "jevota.tafeltennis@telenet.be";
	private static final String FROM_ADDRESS = "info@jevota.be";
	private static final String FROM_NAME = "T.T.C. Jevota Lanaken";
	private static final String FROM_PASSWORD = "j3vot@4ever";

	private static InternetAddress FROM = null;
	{
		try {
			FROM = new InternetAddress(FROM_ADDRESS, FROM_NAME);
		} catch (UnsupportedEncodingException e) {
		}
	}

	public void sendEmail(Collection<PingpongPlayer> recipients, String subject, String body, boolean jevotaCopy)
			throws InvalidEmailException {
		sendEmail(null, recipients, Collections.<PingpongPlayer> emptySet(), subject, body, jevotaCopy);
	}

	public void sendEmail(PingpongPlayer from, Collection<PingpongPlayer> recipients, Collection<PingpongPlayer> cc, String subject,
			String body, boolean jevotaCopy) throws InvalidEmailException {
		sendEmail(from, recipients, cc, Collections.<PingpongPlayer> emptySet(), subject, body, jevotaCopy);
	}

	private InternetAddress[] getAddressesFromPlayers(Collection<PingpongPlayer> players) throws InvalidEmailException {
		List<InternetAddress> result = new ArrayList<InternetAddress>();
		for (PingpongPlayer player : players) {
			result.add(getAddressFromPlayer(player));
		}
		return result.toArray(new InternetAddress[result.size()]);
	}

	private InternetAddress getAddressFromPlayer(PingpongPlayer player) throws InvalidEmailException {
		if (StringUtils.isBlank(player.getEmailAddress())) {
			throw new InvalidEmailException(player);
		}
		try {
			return new InternetAddress(player.getEmailAddress(), player.getFullName());
		} catch (UnsupportedEncodingException e) {
			throw new IllegalArgumentException(e);
		}
	}

	public void sendEmail(PingpongPlayer recipient, String subject, String body, boolean jevotaCopy)
			throws InvalidEmailException {
		sendEmail(Collections.singleton(recipient), subject, body, jevotaCopy);
	}

	public void sendEmail(PingpongPlayer from, Collection<PingpongPlayer> recipients, Collection<PingpongPlayer> cc,
			Collection<PingpongPlayer> bcc, String subject, String body, boolean jevotaCopy)
			throws InvalidEmailException {
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
			if (from != null) {
				message.setReplyTo(getAddressesFromPlayers(Collections.singletonList(from)));
			}
			message.setRecipients(RecipientType.TO, getAddressesFromPlayers(recipients));
			InternetAddress[] ccAddresses = getAddressesFromPlayers(cc);
			if (jevotaCopy) {
				ccAddresses = (InternetAddress[]) ArrayUtils.add(ccAddresses, new InternetAddress(JEVOTA_HOME_ADDRESS));
			}
			if (from != null) {
				ccAddresses = (InternetAddress[]) ArrayUtils.add(ccAddresses, FROM);
			}
			message.setRecipients(RecipientType.CC, ccAddresses);
			message.setRecipients(RecipientType.BCC, getAddressesFromPlayers(bcc));
			message.setSubject(subject);
			message.setText(body);

			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
