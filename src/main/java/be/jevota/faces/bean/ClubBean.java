package be.jevota.faces.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.MapModel;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;

import be.jevota.domain.PingpongClub;
import be.jevota.faces.FacesUtil;
import be.jevota.faces.geo.ClubMarkerGenerator;
import be.jevota.faces.geo.exception.CannotCreateMarkerException;
import be.jevota.service.ClubService;

@Named @Scope("view")
public class ClubBean implements Serializable, Converter {

	private static final long serialVersionUID = 1L;
	
	@Inject private ClubService clubService;
	@Inject private AccountBean accountBean;
	@Inject private ClubMarkerGenerator markerGenerator;
	
	private String redirect;
	private PingpongClub club;
	private List<PingpongClub> clubs;
	private List<PingpongClub> filteredClubs;
	private MapModel mapModel;
	
	@PostConstruct
	public void init() {
		String clubId = FacesUtil.getRequestParam("clubId");
		redirect = FacesUtil.getRequestParam("redirect");
		if(redirect == null) {
			redirect = "/pages/home.xhtml?faces-redirect=true";
		}
		if (clubId != null) {
			club = clubService.getClub(Long.valueOf(clubId));
			mapModel = new DefaultMapModel();
			try {
				mapModel.addOverlay(markerGenerator.generateMarker(club));
			} catch (CannotCreateMarkerException e) {}
		} else {
			club = new PingpongClub();
		}
	}
	
	public boolean isNewClub() {
		return club.getId() == null;
	}
	
	public List<PingpongClub> getClubs() {
		if(clubs == null) {
			clubs = clubService.getClubs();
		}
		return clubs;
	}
	
	public String save() {
		if(!accountBean.isClubMgr()) {
			return FacesUtil.unauthorizedError();
		}
		try {
			clubService.saveClub(club);
			FacesUtil.info("Club werd succesvol opgeslagen!");
			return redirect;
		} catch(DataIntegrityViolationException e) {
			FacesUtil.error("Er bestaat al een club met dit clubnummer of deze naam!");
			return null;
		}
	}
	
	public PingpongClub getClub() {
		return club;
	}

	public void setClub(PingpongClub club) {
		this.club = club;
	}
	
	public List<PingpongClub> getFilteredClubs() {
		return filteredClubs;
	}

	public void setFilteredClubs(List<PingpongClub> filteredClubs) {
		this.filteredClubs = filteredClubs;
	}

	public void toClubInfo() {
		FacesUtil.redirect("/pages/club.jsf?clubId="+club.getId());
	}
	
	public MapModel getMapModel() {
		return mapModel;
	}
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(StringUtils.isBlank(value)) {
			return null;
		}
		return clubService.getClub(Long.valueOf(value));
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null) {
			return StringUtils.EMPTY;
		}
		return String.valueOf(((PingpongClub)value).getId());
	}
	
}
