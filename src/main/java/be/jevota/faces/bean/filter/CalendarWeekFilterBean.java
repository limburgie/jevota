package be.jevota.faces.bean.filter;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongGame;
import be.jevota.domain.cal.CalendarWeek;
import be.jevota.domain.cal.SeasonYear;

@Named @Scope("view")
public class CalendarWeekFilterBean extends AbstractGameFilter<CalendarWeek> {

	@Inject private SeasonFilterBean seasonFilterBean;
	
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void init() {
		filter = new CalendarWeek();
	}
	
	public List<CalendarWeek> getItems() {
		if(items == null) {
			SeasonYear seasonYear = seasonFilterBean.getFilter();
			updateWeekFilter(seasonYear == null ? new SeasonYear() : seasonYear);
		}
		return items;
	}
	
	public void updateWeekFilter(SeasonYear year) {
		items = gameService.getCalendarWeeks(year);
	}

	public Object getAsObject(FacesContext fc, UIComponent comp, String val) {
		return getCalendarWeekForWeekNo(Integer.parseInt(val));
	}

	public String getAsString(FacesContext fc, UIComponent comp, Object val) {
		if(val == null) {
			return StringUtils.EMPTY;
		}
		return String.valueOf(((CalendarWeek) val).getWeekNo());
	}

	@Override
	public List<PingpongGame> getGames() {
		return gameService.getGamesInCalendarWeek(filter);
	}

	private CalendarWeek getCalendarWeekForWeekNo(Integer weekNo) {
		for(CalendarWeek week: getItems()) {
			if(weekNo.equals(week.getWeekNo())) {
				return week;
			}
		}
		return null;
	}

}
