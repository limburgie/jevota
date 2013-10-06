package be.jevota.faces.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.Role;
import be.jevota.faces.FacesUtil;
import be.jevota.service.PlayerService;
import be.jevota.service.RoleService;

@Named @Scope("view")
public class RoleBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject private RoleService roleService;
	@Inject private PlayerService playerService;
	@Inject private AccountBean accountBean;
	
	private Role role;
	private List<Role> roles;
	private PingpongPlayer player;
	
	@PostConstruct
	public void init() {
		String roleId = FacesUtil.getRequestParam("roleId");
		if (roleId != null) {
			role = roleService.getRole(Long.valueOf(roleId));
		}
	}
	
	public void addPlayer() {
		role.getPlayers().add(player);
	}
	
	public void removePlayer(long id) {
		role.getPlayers().remove(playerService.getPlayer(id));
	}
	
	public List<Role> getRoles() {
		if(roles == null) {
			roles = roleService.getRoles();
		}
		return roles;
	}
	
	public String save() {
		if(!accountBean.isAdmin()) {
			return FacesUtil.unauthorizedError();
		}
		roleService.saveRole(role);
		FacesUtil.info(role.getName()+" rol werd succesvol aangepast");
		return "/pages/admin/roles.xhtml?faces-redirect=true";
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public PingpongPlayer getPlayer() {
		return player;
	}

	public void setPlayer(PingpongPlayer player) {
		this.player = player;
	}
	
}
