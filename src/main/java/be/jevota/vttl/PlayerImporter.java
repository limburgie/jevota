package be.jevota.vttl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

public class PlayerImporter {

	public static void main(String[] args) throws IOException {
		String insert = "INSERT INTO PingpongPlayer (firstName, lastName, street, place, memberNo, ranking, phone, mobile, emailAddress, password, recreation, active) VALUES "+
				"(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);";
		List<String> players = FileUtils.readLines(new File("src/main/java/be/jevota/vttl/players-10-2012.csv"));
		for(String player: players) {
			String[] attrs = player.split(",");
			String firstName = strEscape(attrs[1]);
			String lastName = strEscape(attrs[2]);
			String street = StringUtils.isBlank(attrs[3]) ? "NULL" : strEscape(attrs[3]);
			String place = StringUtils.isBlank(attrs[4]) ? "NULL" : strEscape(attrs[4]);
			String memberNo = strEscape(attrs[5]);
			String ranking = strEscape(attrs[6]);
			String phone = StringUtils.isBlank(attrs[7]) ? "NULL" : strEscape(attrs[7]);
			String mobile = StringUtils.isBlank(attrs[8]) ? "NULL" : strEscape(attrs[8]);
			String emailAddress = StringUtils.isBlank(attrs[9]) ? "NULL" : strEscape(attrs[9]);
			String password = StringUtils.isBlank(attrs[10]) ? "NULL" : strEscape(attrs[10]);
			String recreation = attrs[11];
			String active = attrs[12];
			System.out.println(String.format(insert, firstName, lastName, street, place, memberNo, ranking, phone, mobile, emailAddress, password, recreation, active));
		}
	}
	
	private static String strEscape(String input) {
		return "'"+ StringUtils.replace(input, "'", "\\'")+"'";
	}
	
}
