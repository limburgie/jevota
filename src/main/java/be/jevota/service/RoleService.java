package be.jevota.service;

import java.util.List;

import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.Role;
import be.jevota.domain.type.RoleName;

public interface RoleService {

	List<Role> getRoles();

	Role getRole(Long valueOf);

	Role saveRole(Role role);

	void deleteRole(Role role);
	
	boolean hasPlayerRole(PingpongPlayer player, RoleName roleName);

	Role getOrCreateRole(RoleName roleName);

}
