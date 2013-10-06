package be.jevota.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.verify;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import be.jevota.domain.PingpongPlayer;
import be.jevota.repository.PlayerRepository;
import be.jevota.service.exception.InvalidPasswordUpdateException;

public class UpdatePasswordTest extends ServiceTestCase {

	private static final Long PLAYER_ID = 111l;
	
	private static final String OLD_PASS = "test";
	private static final String NEW_PASS = "bla";
	
	private static final String OLD_PASS_HASH = DigestUtils.sha256Hex(OLD_PASS+PLAYER_ID);
	private static final String NEW_PASS_HASH = DigestUtils.sha256Hex(NEW_PASS+PLAYER_ID);
	
	private PingpongPlayer player;
	
	@Mock private PlayerRepository repoMock;
	@InjectMocks private PlayerServiceImpl playerService;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		player = new PingpongPlayer();
		player.setPassword(OLD_PASS_HASH);
		player.setId(PLAYER_ID);
	}
	
	@Test
	public void testOldPasswordIncorrectThrowsException() {
		String oldPassword = "test1";
		String newPassword = "bla";
		String repeatNewPassword = "bla";
		try {
			playerService.updatePassword(player, oldPassword, newPassword, repeatNewPassword);
			fail();
		} catch(InvalidPasswordUpdateException e) {
			assertEquals("Oud wachtwoord is niet correct", e.getMessage());
		}
	}
	
	@Test
	public void testNewPasswordsAreNotEqualThrowsException() {
		String oldPassword = "test";
		String newPassword = "blaat";
		String repeatNewPassword = "bla";
		try {
			playerService.updatePassword(player, oldPassword, newPassword, repeatNewPassword);
			fail();
		} catch(InvalidPasswordUpdateException e) {
			assertEquals("Nieuwe wachtwoorden komen niet overeen", e.getMessage());
		}
	}
	
	@Test
	public void testNewPasswordSameAsOldPasswordThrowsException() {
		String oldPassword = "test";
		String newPassword = "test";
		String repeatNewPassword = "test";
		try {
			playerService.updatePassword(player, oldPassword, newPassword, repeatNewPassword);
			fail();
		} catch(InvalidPasswordUpdateException e) {
			assertEquals("Nieuw wachtwoord is gelijk aan oud wachtwoord", e.getMessage());
		}
	}
	
	@Test
	public void testEverythingOkCallsRepositoryUpdateWithNewPassword() throws InvalidPasswordUpdateException {
		String oldPassword = "test";
		String newPassword = "bla";
		String repeatNewPassword = "bla";
		playerService.updatePassword(player, oldPassword, newPassword, repeatNewPassword);
		verify(repoMock).save(argThat(new ArgumentMatcher<PingpongPlayer>() {
			@Override
			public boolean matches(Object argument) {
				PingpongPlayer player = (PingpongPlayer) argument;
				return player.getPassword().equals(NEW_PASS_HASH);
			}
		}));
	}
	
}
