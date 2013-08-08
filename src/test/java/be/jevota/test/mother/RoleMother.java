package be.jevota.test.mother;

import java.util.Arrays;

import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.Role;
import be.jevota.domain.type.RoleName;

public class RoleMother {

	public static Role create(RoleName roleName, PingpongPlayer... players) {
		Role role = new Role();
		role.setName(roleName);
		role.setPlayers(Arrays.asList(players));
		return role;
	}
	
}
