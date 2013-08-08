package be.jevota.faces.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.MapModel;
import org.springframework.context.annotation.Scope;

import be.jevota.domain.PingpongClub;
import be.jevota.faces.geo.ClubMarkerGenerator;
import be.jevota.faces.geo.exception.CannotCreateMarkerException;
import be.jevota.service.ClubService;

@Named @Scope("view")
public class ContactBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject private ClubService clubService;
	@Inject private ClubMarkerGenerator markerGenerator;
	
	private PingpongClub lanaken;
	private MapModel mapModel;
	
	@PostConstruct
	public void init() {
		lanaken = clubService.getJevotaClub();
		mapModel = new DefaultMapModel();
		try {
			mapModel.addOverlay(markerGenerator.generateMarker(lanaken));
		} catch (CannotCreateMarkerException e) {}
	}
	
	public PingpongClub getLanaken() {
		return lanaken;
	}
	
	public MapModel getMapModel() {
		return mapModel;
	}
	
}
