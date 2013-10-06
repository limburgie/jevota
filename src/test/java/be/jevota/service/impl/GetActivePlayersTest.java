package be.jevota.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.type.Ranking;
import be.jevota.repository.PlayerRepository;

public class GetActivePlayersTest {

	@Mock private PlayerRepository playerRepositoryMock;
	@InjectMocks private PlayerServiceImpl playerService;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
		PingpongPlayer player1 = new PingpongPlayer();
		player1.setId(1l);
		player1.setRanking(Ranking.E4);
		
		PingpongPlayer player2 = new PingpongPlayer();
		player2.setId(2l);
		player2.setRanking(Ranking.E4);
		
		PingpongPlayer player3 = new PingpongPlayer();
		player3.setId(3l);
		player3.setRanking(Ranking.E6);
		
		PingpongPlayer player4 = new PingpongPlayer();
		player4.setId(4l);
		player4.setRanking(Ranking.E6);
		
		when(playerRepositoryMock.findByActiveOrderByRankingAscLastNameAsc(true)).thenReturn(
				Arrays.asList(player1, player2, player3, player4));
		
		List<PingpongPlayer> players = playerService.getActivePlayers(false);
		assertEquals(2, players.get(0).getIndex());
		assertEquals(2, players.get(1).getIndex());
		assertEquals(4, players.get(2).getIndex());		
		assertEquals(4, players.get(3).getIndex());		
	}
	
}
