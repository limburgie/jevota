package be.jevota.vttl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.IOUtils;

import be.jevota.vttl.domain.Match;
import be.jevota.vttl.domain.Season;
import be.jevota.vttl.helper.Pointer;

public class VttlExporter {

	private static final String VTTL_URL_FORMAT = "http://competitie.vttl.be/index.php?menu=3&type=4&club_id=218&sel_week=%s";
	
	public Season getSeason() throws IOException {
		Set<Match> matches = new HashSet<Match>();
		for(int week=1; week<=52; week++) {
			System.out.println("Week "+week);
			matches.addAll(getMatchesInWeek(week));
		}
		Season season = new Season();
		season.setMatches(matches);
		return season;
	}
	
	private Set<Match> getMatchesInWeek(int week) throws IOException {
		Set<Match> weekMatches = new HashSet<Match>();
		InputStream in = new URL(String.format(VTTL_URL_FORMAT, week)).openStream();
		try {
			String page = IOUtils.toString(in);
			if(page.contains("Geen ontmoeting")) {
				return Collections.emptySet();
			}
			Pointer pointer = new Pointer(page);
			for(int line=0; line<13; line++) {
				try {
					weekMatches.add(getMatch(pointer));
				} catch (InvalidMatchException e) {
					continue;
				}
			}
			return weekMatches;
		} finally {
			IOUtils.closeQuietly(in);
		}
	}
	
	private Match getMatch(Pointer pointer) throws InvalidMatchException {
		Match match = new Match();
		String division = pointer.getNextBetween("<td class=\"DBTable_first\">", "</td>");
		if(division == null) {
			throw new InvalidMatchException();
		}
		match.setDivision(division);
		String date = pointer.getNextBetween("<td class=DBTable>", "</td>");
		if(date.equals("-")) {
			throw new InvalidMatchException();
		}
		match.setDate(date);
		match.setTime(pointer.getNextBetween("<td class=DBTable>", "</td>"));
		match.setGameId(pointer.getNextBetween("<td class=DBTable>", "</td>"));
		match.setHomeTeam(pointer.getNextBetween("<td class=DBTable>", "</td>"));
		match.setOutTeam(pointer.getNextBetween("<td class=DBTable>", "</td>"));
		return match;
	}

	static class InvalidMatchException extends Exception {

		private static final long serialVersionUID = 1L;
		
	}

}