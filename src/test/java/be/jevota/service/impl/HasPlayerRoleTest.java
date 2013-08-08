package be.jevota.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
import be.jevota.test.mother.RoleMother;

public class HasPlayerRoleTest extends ServiceTestCase {

	@Inject private RoleService roleService;
	@Inject private PlayerService playerService;
	
	private PingpongPlayer player;
	private Role adminRole;
	private Role newsEditorRole;
	
	@Before
	public void setup() {
		player = playerService.savePlayer(PlayerMother.create("Peter", "Mesotten"));
		
		adminRole = roleService.saveRole(RoleMother.create(RoleName.ADMINISTRATOR));
		newsEditorRole = roleService.saveRole(RoleMother.create(RoleName.NEWS_MANAGER));
	}
	
	@Test
	public void testPlayerWithAdminRoleAlsoHasOtherRoles() {
		adminRole.setPlayers(Collections.singletonList(player));
		roleService.saveRole(adminRole);
		
		for(RoleName roleName: RoleName.values()) {
			assertTrue(roleService.hasPlayerRole(player, roleName));
		}
	}
	
	@Test
	public void testPlayerWithNonAdminRoleHasNoOtherRoles() {
		newsEditorRole.setPlayers(Collections.singletonList(player));
		roleService.saveRole(newsEditorRole);
		
		for(RoleName roleName: RoleName.values()) {
			assertEquals(roleName == RoleName.NEWS_MANAGER, roleService.hasPlayerRole(player, roleName));
		}
	}
	
	@Test
	public void testRolePlayers() {
		newsEditorRole.setPlayers(Collections.singletonList(player));
		roleService.saveRole(newsEditorRole);
		
		assertEquals(Collections.singletonList(player), roleService.getOrCreateRole(RoleName.NEWS_MANAGER).getPlayers());
	}
	
	@After
	public void cleanup() {
		roleService.deleteRole(adminRole);
		roleService.deleteRole(newsEditorRole);
		playerService.deletePlayer(player);
	}
	
}
