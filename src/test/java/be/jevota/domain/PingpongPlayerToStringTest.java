package be.jevota.domain;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import be.jevota.domain.type.Ranking;

public class PingpongPlayerToStringTest {

	private PingpongPlayer player;
	
	@Before
	public void setup() {
		player = new PingpongPlayer();
		player.setFirstName("Peter");
		player.setLastName("Mesotten");
		player.setRanking(Ranking.A2);
	}
	
	@Test
	public void ifMemberNoIsEmptyThenJustShowPlayerAndRanking() {
		assertThat(player.toString(), is(equalTo("[A2] Peter Mesotten")));
	}
	
	@Test
	public void ifMemberNoIsFilledThenShowMemberNoAsWell() {
		player.setMemberNo(123456);
		assertThat(player.toString(), is(equalTo("[A2] Peter Mesotten (123456)")));
	}
	
}
