package be.jevota.faces.bean.filter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongGame;
import be.jevota.domain.cal.SeasonWeek;
import be.jevota.domain.cal.SeasonYear;

@Named
@Scope("view")
public class SeasonWeekFilterBean extends AbstractGameFilter<SeasonWeek> {

	@Inject private SeasonFilterBean seasonFilterBean;
	
	private static final long serialVersionUID = 1L;

	@Override
	public List<SeasonWeek> getItems() {
		if(items == null) {
			SeasonYear seasonYear = seasonFilterBean.getFilter();
			updateWeekFilter(seasonYear == null ? new SeasonYear() : seasonYear);
		}
		return super.getItems();
	}
	
	public void updateWeekFilter(SeasonYear year) {
		items = gameService.getSeasonWeeks(year);
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return getSeasonWeekForWeek(Integer.valueOf(value));
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null) {
			return StringUtils.EMPTY;
		}
		return String.valueOf(((SeasonWeek) value).getWeekNo());
	}

	@Override
	public List<PingpongGame> getGames() {
		return gameService.getGamesInSeasonWeek(filter);
	}
	
	private SeasonWeek getSeasonWeekForWeek(Integer intVal) {
		for(SeasonWeek week: getItems()) {
			if(intVal.equals(week.getWeekNo())) {
				return week;
			}
		}
		return null;
	}
	
}
