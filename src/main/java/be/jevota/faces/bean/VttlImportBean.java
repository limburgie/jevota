package be.jevota.faces.bean;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import be.jevota.domain.cal.SeasonYear;
import be.jevota.faces.FacesUtil;
import be.jevota.faces.bean.filter.SeasonFilterBean;
import be.jevota.service.VttlImporter;
import be.jevota.service.exception.VttlImportException;

@Named
@Scope("view")
public class VttlImportBean implements Serializable {

	@Inject private VttlImporter vttlImporter;
	@Inject private SeasonFilterBean seasonFilter;

	public void importGames() {
		try {
			SeasonYear year = seasonFilter.getFilter();
			vttlImporter.importSchedule(year);
			vttlImporter.importResults(year);
			FacesUtil.info("Wedstrijden werden succesvol opgehaald uit VTTL.");
		} catch (VttlImportException e) {
			FacesUtil.unexpectedError(e);
		}
	}

}
