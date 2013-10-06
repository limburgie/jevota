package be.jevota.service;

import be.jevota.domain.cal.SeasonYear;
import be.jevota.service.exception.VttlImportException;

public interface VttlImporter {

	void importSchedule(SeasonYear year) throws VttlImportException;

	void importResults(SeasonYear year) throws VttlImportException;

}
