package be.jevota.faces.bean.filter;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongGame;
import be.jevota.faces.bean.LineupBean;

@Named @Scope("view")
public class GameFilterBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@Inject private CalendarWeekFilterBean calendarWeekFilterBean;
	@Inject private SeasonWeekFilterBean seasonWeekFilterBean;
	@Inject private SeasonFilterBean seasonFilterBean;
	@Inject private TeamFilterBean teamFilterBean;
	@Inject private LineupBean lineupBean;
	
	private List<AbstractGameFilter<?>> toggableFilters;
	private List<PingpongGame> games;
	private AbstractGameFilter<?> activeFilter;
	
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {
		toggableFilters = Arrays.asList(calendarWeekFilterBean, seasonWeekFilterBean, teamFilterBean);
		activeFilter = calendarWeekFilterBean;
	}
	
	public void filterBySeason() {
		activeFilter = seasonFilterBean;
		reset();
	}
	
	public void filterBySeasonWeek() {
		activeFilter = seasonWeekFilterBean;
		reset();
	}
	
	public void filterByCalendarWeek() {
		activeFilter = calendarWeekFilterBean;
		reset();
	}
	
	public void filterByTeam() {
		activeFilter = teamFilterBean;
		reset();
	}
	
	public List<PingpongGame> getGames() {
		if(games == null) {
			games = activeFilter.getGames();
		}
		return games;
	}
	
	public AbstractGameFilter<?> getActiveFilter() {
		return activeFilter;
	}

	private void reset() {
		resetTableSort();
		games = null;
		for(AbstractGameFilter<?> filter: toggableFilters) {
			if(filter != activeFilter) {
				filter.reset();
			}
		}
		lineupBean.clear();
	}

	private void resetTableSort() {
		UIComponent table = FacesContext.getCurrentInstance().getViewRoot().findComponent(":gamesForm:games");
		if(table != null) {
			table.setValueExpression("sortBy", null);
		}
	}

}
