package be.jevota.faces.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import be.jevota.domain.PhotoAlbum;
import be.jevota.faces.FacesUtil;
import be.jevota.service.PhotoService;
import be.jevota.service.exception.PhotoSynchronizationException;

@Named @Scope("view")
public class PhotoBean implements Serializable, Converter {

	private static final long serialVersionUID = 1L;
	
	@Inject private PhotoService photoService;
	
	private List<PhotoAlbum> albums;
	private PhotoAlbum album;
	private PhotoAlbum latestAlbum;
	
	@PostConstruct
	public void init() {
		String albumId = FacesUtil.getRequestParam("albumId");
		if (albumId != null) {
			album = photoService.getAlbum(Long.valueOf(albumId));
		}
	}
	
	public void synchronize() {
		try {
			photoService.synchronize();
			initAlbums();
			FacesUtil.info("Albums werden succesvol gesynchroniseerd met Picasa");
		} catch (PhotoSynchronizationException e) {
			FacesUtil.error("Er gebeurde een fout bij het synchroniseren.");
		}
	}
	
	public List<PhotoAlbum> getAlbums() {
		if(albums == null) {
			initAlbums();
		}
		return albums;
	}
	
	public PhotoAlbum getAlbum() {
		return album;
	}
	
	public void setAlbum(PhotoAlbum album) {
		this.album = album;
	}
	
	public PhotoAlbum getLatestAlbum() {
		if(latestAlbum == null) {
			latestAlbum = photoService.getLatestAlbum();
		}
		return latestAlbum;
	}
	
	public void toAlbum() {
		FacesUtil.redirect("/pages/album.jsf?albumId="+album.getId());
	}
	
	private void initAlbums() {
		albums = photoService.getAlbums();
	}

	public Object getAsObject(FacesContext fc, UIComponent comp, String val) {
		return photoService.getAlbum(Long.valueOf(val));
	}

	public String getAsString(FacesContext fc, UIComponent comp, Object val) {
		return String.valueOf(((PhotoAlbum)val).getId());
	}
	
}
