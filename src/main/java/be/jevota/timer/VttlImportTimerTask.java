package be.jevota.timer;

import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.joda.time.DateMidnight;

import be.jevota.domain.cal.SeasonYear;
import be.jevota.service.VttlImporter;
import be.jevota.service.exception.VttlImportException;

@Named
public class VttlImportTimerTask extends TimerTask {

	@Inject private VttlImporter vttlImporter;

	@PostConstruct
	public void init() {
		Timer timer = new Timer();
		timer.schedule(this, new DateMidnight().plusDays(1).toDate(), 1000 * 60 * 60 * 24);
		System.out.println("Timer initialized");
	}

	public void run() {
		SeasonYear year = new SeasonYear();
		try {
			vttlImporter.importSchedule(year);
			vttlImporter.importResults(year);
			System.out.println("Imported games from VTTL");
		} catch (VttlImportException e) {
			e.printStackTrace();
		}
	}

}
