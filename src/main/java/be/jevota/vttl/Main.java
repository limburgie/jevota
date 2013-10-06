package be.jevota.vttl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		VttlExporter export = new VttlExporter();
		String sql = export.getSeason().getSql();
		FileUtils.writeStringToFile(new File("src/main/java/be/jevota/vttl/31-10-2012.sql"), sql);
	}
	
}
