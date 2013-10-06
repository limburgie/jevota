package be.jevota.faces.bean.filter;

import java.io.Serializable;
import java.util.List;

import javax.faces.convert.Converter;
import javax.inject.Inject;

import be.jevota.domain.PingpongGame;
import be.jevota.service.GameService;

public abstract class AbstractGameFilter<T> implements Converter, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject protected GameService gameService;
	
	protected T filter;
	protected List<T> items;
	
	public abstract List<PingpongGame> getGames();

	public void reset() {
		filter = null;
		items = null;
	}
	
	public T getFilter() {
		return filter;
	}

	public void setFilter(T filter) {
		this.filter = filter;
	}

	public List<T> getItems() {
		return items;
	}

}
