package be.jevota.faces.bean.filter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongTeam;
import be.jevota.service.TeamService;

@Named @Scope("view")
public class TeamFilterBean extends AbstractGameFilter<PingpongTeam> {

	private static final long serialVersionUID = 1L;

	@Inject private TeamService teamService;
	@Inject private SeasonFilterBean seasonFilterBean;
	
	@Override
	public List<PingpongTeam> getItems() {
		if(items == null) {
			items = teamService.getJevotaTeams();
		}
		return items;
	}
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(StringUtils.isEmpty(value)) {
			return null;
		}
		return teamService.getTeam(Long.valueOf(value));
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null) {
			return StringUtils.EMPTY;
		}
		return String.valueOf(((PingpongTeam)value).getId());
	}

	@Override
	public List<PingpongGame> getGames() {
		return gameService.getGamesForTeam(seasonFilterBean.getFilter(), filter);
	}

}
