package be.jevota.faces.bean.filter;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.joda.time.DateTime;
import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongGame;
import be.jevota.domain.cal.SeasonYear;

@Named @Scope("view")
public class SeasonFilterBean extends AbstractGameFilter<SeasonYear> {

	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
		items = new ArrayList<SeasonYear>();
		for(int startYear = 2011; startYear <= new DateTime().getYear(); startYear++) {
			items.add(new SeasonYear(startYear));
		}
		filter = new SeasonYear();
	}

	public Object getAsObject(FacesContext fc, UIComponent comp, String val) {
		return new SeasonYear(Integer.valueOf(val));
	}

	public String getAsString(FacesContext fc, UIComponent comp, Object val) {
		return String.valueOf(((SeasonYear)val).getStartYear());
	}
	
	@Override
	public List<PingpongGame> getGames() {
		return gameService.getGamesInSeason(filter);
	}
	
}
