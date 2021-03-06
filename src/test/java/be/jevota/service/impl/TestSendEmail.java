package be.jevota.service.impl;

import java.util.Collections;
import java.util.Set;

import be.jevota.domain.PingpongPlayer;
import be.jevota.service.exception.InvalidEmailException;
import be.jevota.test.mother.PlayerMother;

public class TestSendEmail {

	public static void main(String[] args) throws InvalidEmailException {
		PingpongPlayer peter = PlayerMother.create("Peter", "Mesotten");
		peter.setEmailAddress("p.mesotten@aca-it.be");

		MailServiceGmailImpl mailService = new MailServiceGmailImpl();
		Set<PingpongPlayer> rec = Collections.singleton(peter);
		Set<PingpongPlayer> cc = Collections.singleton(peter);
		Set<PingpongPlayer> bcc = Collections.singleton(peter);
		mailService.sendEmail(rec, cc, bcc, "Test from Java", "Body test", true);
	}

}
