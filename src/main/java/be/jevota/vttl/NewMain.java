package be.jevota.vttl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NewMain {

	public static void main(String[] args) throws IOException {
		for(int week=1; week<=52; week++) {
			String url = String.format("http://competitie.vttl.be/index.php?menu=3&type=4&club_id=218&sel_week=%s", week);
			Document page = Jsoup.connect(url).get();
			Elements rows = page.select("tr.DBTable");
			for(int i=2; i<rows.size(); i++) {
				Element row = rows.get(i);
				String afd = row.select("td.DBTable_first").get(0).text();
				System.out.println(afd);
			}
		}
	}
	
}
