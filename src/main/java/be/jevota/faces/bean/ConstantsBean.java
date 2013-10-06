package be.jevota.faces.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import be.jevota.domain.type.Ranking;

@Named
public class ConstantsBean {

	public static final Locale LOCALE = new Locale("nl", "BE");

	private List<SelectItem> rankingItems;
	private List<SelectItem> yesNoDropdown;
	private List<String> teamNos = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
			"O", "P");
	private List<Integer> seasonWeekNos;

	@PostConstruct
	public void init() {
		initRankingItems();
		initYesNoDropdown();
		initSeasonWeekNos();
	}

	private void initSeasonWeekNos() {
		seasonWeekNos = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			seasonWeekNos.add(i);
		}
	}

	private void initYesNoDropdown() {
		yesNoDropdown = new ArrayList<SelectItem>();
		yesNoDropdown.add(new SelectItem("", ""));
		yesNoDropdown.add(new SelectItem("true", "Ja"));
		yesNoDropdown.add(new SelectItem("false", "Nee"));
	}

	private void initRankingItems() {
		rankingItems = new ArrayList<SelectItem>();
		rankingItems.add(new SelectItem(null, ""));
		for (Ranking ranking : Ranking.values()) {
			rankingItems.add(new SelectItem(ranking, ranking.name()));
		}
	}

	public Locale getLocale() {
		return LOCALE;
	}

	public List<SelectItem> getRankingItems() {
		return rankingItems;
	}

	public List<SelectItem> getYesNoDropdown() {
		return yesNoDropdown;
	}

	public List<String> getTeamNos() {
		return teamNos;
	}

	public List<Integer> getSeasonWeekNos() {
		return seasonWeekNos;
	}

}
