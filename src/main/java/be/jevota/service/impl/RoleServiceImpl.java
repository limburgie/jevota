package be.jevota.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.Role;
import be.jevota.domain.type.RoleName;
import be.jevota.repository.RoleRepository;
import be.jevota.service.PlayerService;
import be.jevota.service.RoleService;

@Named
public class RoleServiceImpl implements RoleService {

	@Inject private RoleRepository repo;
	@Inject private PlayerService playerService;

	public List<Role> getRoles() {
		return repo.getRoles();
	}

	public Role getRole(Long id) {
		return repo.findOne(id);
	}
	
	public Role getOrCreateRole(RoleName roleName) {
		Role role = repo.findByName(roleName);
		if(role == null) {
			role = new Role();
			role.setName(roleName);
			role = repo.save(role);
		}
		return role;
	}

	@Transactional
	public Role saveRole(Role role) {
		//TODO Should be refactored because actually we want Set<PingpongPlayer> on our Role
		Set<PingpongPlayer> playerSet = new HashSet<PingpongPlayer>(role.getPlayers());
		role.setPlayers(new ArrayList<PingpongPlayer>(playerSet));
		return repo.save(role);
	}

	@Transactional
	public void deleteRole(Role role) {
		role.setPlayers(new ArrayList<PingpongPlayer>());
		repo.save(role);
		repo.delete(role);
	}

	public boolean hasPlayerRole(PingpongPlayer player, RoleName roleName) {
		Role adminRole = getOrCreateRole(RoleName.ADMINISTRATOR);
		player = playerService.getPlayer(player.getId());
		if(player.getRoles().contains(adminRole)) {
			return true;
		}
		return player.getRoles().contains(getOrCreateRole(roleName));
	}

}
