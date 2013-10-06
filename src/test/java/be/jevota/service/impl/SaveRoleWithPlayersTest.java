package be.jevota.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.Role;
import be.jevota.domain.type.RoleName;
import be.jevota.service.PlayerService;
import be.jevota.service.RoleService;
import be.jevota.test.mother.PlayerMother;

public class SaveRoleWithPlayersTest extends ServiceTestCase {

	@Inject private RoleService roleService;
	@Inject private PlayerService playerService;
	
	private PingpongPlayer player1;
	private PingpongPlayer player2;
	private Role role;
	
	@Before
	public void setup() {
		player1 = playerService.savePlayer(PlayerMother.create("Peter", "Mesotten"));
		player2 = playerService.savePlayer(PlayerMother.create("Yannick", "Mesotten"));
		
		role = new Role();
		role.setName(RoleName.ADMINISTRATOR);
	}
	
	@Test
	public void testRoleWithPlayers() {
		role.setPlayers(Collections.singletonList(player1));
		role = roleService.saveRole(role);
		
		role = roleService.getRole(role.getId());
		assertTrue(role.getPlayers().contains(player1));
	}
	
	@Test
	public void testMultiplePlayersOnSameRoleSavedOnlyOnce() {
		role.setPlayers(Arrays.asList(player1, player2, player2));
		role = roleService.saveRole(role);
		
		role = roleService.getRole(role.getId());
		assertTrue(role.getPlayers().contains(player1));
		assertTrue(role.getPlayers().contains(player2));
		assertEquals(2, role.getPlayers().size());
	}
	
	@After
	public void cleanup() {
		role.setPlayers(new ArrayList<PingpongPlayer>());
		roleService.saveRole(role);
		playerService.deletePlayer(player1);
		playerService.deletePlayer(player2);
		roleService.deleteRole(role);
	}
	
}
