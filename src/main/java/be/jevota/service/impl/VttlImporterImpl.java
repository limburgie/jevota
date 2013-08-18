package be.jevota.service.impl;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.inject.Named;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import be.jevota.domain.PingpongClub;
import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongTeam;
import be.jevota.domain.cal.SeasonYear;
import be.jevota.service.ClubService;
import be.jevota.service.GameService;
import be.jevota.service.TeamService;
import be.jevota.service.VttlImporter;
import be.jevota.service.exception.VttlImportException;

@Named
public class VttlImporterImpl implements VttlImporter {

	private static final String FORFAIT = "ff";
	private static final String GEEN_UITSLAG = "gu";
	private static final String LANAKEN = "Lanaken";
	private static final String VRIJE_TIJD = "Vrije Tijd";
	private static final String VRIJ = "Vrij";

	@Inject private ClubService clubService;
	@Inject private TeamService teamService;
	@Inject private GameService gameService;

	public void importSchedule(SeasonYear year) throws VttlImportException {
		for (int week = 1; week <= 52; week++) {
			String url = String.format(
					"http://competitie.vttl.be/index.php?season=%s&menu=3&type=4&club_id=218&sel_week=%s",
					getSeasonShort(year), week);
			try {
				Document page = Jsoup.connect(url).get();
				Elements rows = page.select("tr.DBTable");
				for (int i = 2; i < rows.size(); i++) {
					Element row = rows.get(i);
					String division = row.select("td.DBTable_first").get(0).text();
					boolean recreation = division.contains(VRIJE_TIJD);

					Elements cols = row.select("td.DBTable");
					String dateStr = cols.get(0).text();
					String timeStr = cols.get(1).text();
					String vttlId = cols.get(2).text();
					String thuis = cols.get(3).text();
					String bezoekers = cols.get(4).text();

					if (thuis.startsWith(VRIJ) || bezoekers.startsWith(VRIJ)) {
						continue;
					}

					PingpongGame game = new PingpongGame();
					game.setVttlId(vttlId);
					game.setHomeTeam(getOrCreateTeam(recreation, thuis));
					game.setOutTeam(getOrCreateTeam(recreation, bezoekers));
					game.setDate(getDate(dateStr, timeStr));
					game.setWeekNo(getWeekNo(vttlId));

					gameService.createOrUpdateGame(game);
				}
			} catch (IOException e) {
				throw new VttlImportException(e);
			} catch (ParseException e) {
				throw new VttlImportException(e);
			}
		}
	}

	private String getSeasonShort(SeasonYear year) {
		return Integer.toString(year.getEndYear()).substring(2);
	}

	private PingpongTeam getOrCreateTeam(boolean recreation, String team) {
		PingpongClub club = getOrCreateClub(team);
		return teamService.getOrCreateTeam(club, getTeamNo(team), recreation);
	}

	private String getTeamNo(String team) {
		String[] parts = team.split(" ");
		return parts[parts.length - 1];
	}

	private PingpongClub getOrCreateClub(String team) {
		if (team.startsWith(LANAKEN)) {
			return clubService.getJevotaClub();
		}
		String[] parts = team.split(" ");
		String number = parts[0].substring(2);
		String name = parts[1];
		return clubService.getOrCreateClub(number, name);
	}

	private int getWeekNo(String wedstrijd) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(wedstrijd);
		while (m.find()) {
			return Integer.parseInt(m.group());
		}
		return 0;
	}

	private Date getDate(String dateStr, String timeStr) throws ParseException {
		return new SimpleDateFormat("dd-MM-yyHH:mm").parse(dateStr + timeStr);
	}

	public void importResults(SeasonYear year) throws VttlImportException {
		for (int week = 1; week < 25; week++) {
			String weekNo = getWeekNo(week);
			String url = String.format(
					"http://competitie.vttl.be/index.php?menu=4&season=%s&list=1&club_id=218&week_name=%s",
					getSeasonShort(year), weekNo);
			try {
				Document page = Jsoup.connect(url).get();
				Elements rows = page.select("tr.DBTable");
				if (rows.isEmpty()) {
					continue;
				}
				for (int i = 2; i < rows.size(); i++) {
					Element row = rows.get(i);
					String vttlId = row.select("td.DBTable_first").get(0).text();
					Elements cols = row.select("td.DBTable");
					String home = cols.get(0).text();
					String out = cols.get(1).text();
					String score = cols.get(2).text();
					if (home.startsWith(VRIJ) || out.startsWith(VRIJ) || score.contains(GEEN_UITSLAG)) {
						continue;
					}
					boolean forfait = score.contains(FORFAIT);
					List<Integer> scoreResults = getScore(score);
					Integer homeTeamPts = scoreResults.get(0);
					Integer outTeamPts = scoreResults.get(1);

					gameService.updateScore(year, vttlId, homeTeamPts, outTeamPts, forfait);
				}
			} catch (IOException e) {
				throw new VttlImportException(e);
			}
		}
	}

	private List<Integer> getScore(String score) {
		Matcher scoreMatcher = Pattern.compile("\\d+").matcher(score);
		List<Integer> scoreResult = new ArrayList<Integer>();
		while (scoreMatcher.find()) {
			scoreResult.add(Integer.parseInt(scoreMatcher.group()));
		}
		return scoreResult;
	}

	private String getWeekNo(int week) {
		DecimalFormat df = new DecimalFormat("#00.###");
		df.setDecimalSeparatorAlwaysShown(false);
		return df.format(week);
	}
}
