package be.jevota.faces.bean;

import be.jevota.domain.PingpongPlayer;
import be.jevota.domain.type.RoleName;
import be.jevota.service.RoleService;
import org.springframework.context.annotation.Scope;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Named @Scope("session")
public class AccountBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject private RoleService roleService;
	
	private Map<RoleName, Boolean> roles = new HashMap<RoleName, Boolean>();

	public void initializeRoles(PingpongPlayer player) {
		for(RoleName roleName: RoleName.values()) {
			roles.put(roleName, roleService.hasPlayerRole(player, roleName));
		}
	}
	
	public void clearRoles() {
		roles = new HashMap<RoleName, Boolean>();
	}
	
	public boolean hasRole(RoleName roleName) {
		return roles.containsKey(roleName) && roles.get(roleName);
	}
	
	public boolean isAdmin() {
		return hasRole(RoleName.ADMINISTRATOR);
	}
	
	public boolean isNewsMgr() {
		return hasRole(RoleName.NEWS_MANAGER);
	}

	public boolean isEventMgr() {
		return hasRole(RoleName.EVENT_MANAGER);
	}

	public boolean isGameMgr() {
		return hasRole(RoleName.GAME_MANAGER);
	}
	
	public boolean isClubMgr() {
		return hasRole(RoleName.CLUB_MANAGER);
	}
	
	public boolean isPlayerMgr() {
		return hasRole(RoleName.PLAYER_MANAGER);
	}
	
	public boolean isLineupMgr() {
		return hasRole(RoleName.LINEUP_MANAGER);
	}
	
	public boolean isPictureMgr() {
		return hasRole(RoleName.PICTURE_MANAGER);
	}
	
	public boolean isPowerUser() {
		for(RoleName roleName: RoleName.values()) {
			if(hasRole(roleName)) {
				return true;
			}
		}
		return false;
	}

}
