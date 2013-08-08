package be.jevota.domain;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GetOpponentLabelTest {

	@Mock private PingpongTeam home;
	@Mock private PingpongTeam out;
	
	private PingpongGame game;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		game = new PingpongGame();
		game.setHomeTeam(home);
		game.setOutTeam(out);
		when(home.getId()).thenReturn(1l);
		when(out.getId()).thenReturn(2l);
	}
	
	@Test
	public void testLanakenVsOpponent() {
		when(home.isLanaken()).thenReturn(true);
		when(out.isLanaken()).thenReturn(false);
		when(out.getName()).thenReturn("Bree B");
		assertEquals("Thuis Bree B", game.getOpponentLabel(home));
	}
	
	@Test
	public void testOpponentVsLanaken() {
		when(home.isLanaken()).thenReturn(false);
		when(out.isLanaken()).thenReturn(true);
		when(home.getName()).thenReturn("Bree B");
		assertEquals("Uit Bree B", game.getOpponentLabel(out));
	}
	
	@Test
	public void testLanakenVsLanaken() {
		when(home.isLanaken()).thenReturn(true);
		when(out.isLanaken()).thenReturn(true);
		when(home.getName()).thenReturn("Lanaken A");
		when(out.getName()).thenReturn("Lanaken B");
		assertEquals("Thuis Lanaken A", game.getOpponentLabel(out));
		assertEquals("Thuis Lanaken B", game.getOpponentLabel(home));
	}
	
}
