package be.jevota.service.comparator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import be.jevota.domain.PingpongGame;
import be.jevota.test.mother.GameMother;
import be.jevota.test.mother.TeamMother;

public class GameByTeamComparatorTest {

	private GameByTeamComparator comparator;
	
	private PingpongGame game1;
	private PingpongGame game2;
	private PingpongGame game3;
	
	private List<PingpongGame> games;
	
	@Before
	public void setup() {
		comparator = new GameByTeamComparator();
	}
	
	@Test
	public void testRecreationComesAfterNonRecreation() {
		game1 = GameMother.create(1, TeamMother.create(true, "A", true), TeamMother.create(false, "B", true));
		game2 = GameMother.create(2, TeamMother.create(true, "B", false), TeamMother.create(false, "A", false));
		games = Arrays.asList(game1, game2);
		Collections.sort(games, comparator);
		assertEquals(game2, games.get(0));
		assertEquals(game1, games.get(1));
	}
	
	@Test
	public void testHigherLanakenTeamComesAfterLowerTeam() {
		game1 = GameMother.create(1, TeamMother.create(true, "A", true), TeamMother.create(false, "B", true));
		game2 = GameMother.create(2, TeamMother.create(true, "C", true), TeamMother.create(false, "D", true));
		game3 = GameMother.create(3, TeamMother.create(true, "B", true), TeamMother.create(false, "C", true));
		games = Arrays.asList(game1, game2, game3);
		Collections.sort(games, comparator);
		assertEquals(game1, games.get(0));
		assertEquals(game3, games.get(1));
		assertEquals(game2, games.get(2));
	}
	
	@Test
	public void testHigherTeamDecidesPositionOfGameIfBothLanaken() {
		game1 = GameMother.create(1, TeamMother.create(true, "A", true), TeamMother.create(false, "B", true));
		game2 = GameMother.create(2, TeamMother.create(true, "C", true), TeamMother.create(false, "D", true));
		game3 = GameMother.create(3, TeamMother.create(true, "E", true), TeamMother.create(true, "B", true));
		games = Arrays.asList(game1, game2, game3);
		Collections.sort(games, comparator);
		assertEquals(game1, games.get(0));
		assertEquals(game3, games.get(1));
		assertEquals(game2, games.get(2));
	}
	
}
