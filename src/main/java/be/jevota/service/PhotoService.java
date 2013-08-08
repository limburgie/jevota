package be.jevota.service;

import java.util.List;

import be.jevota.domain.PhotoAlbum;
import be.jevota.service.exception.PhotoSynchronizationException;

public interface PhotoService {

	List<PhotoAlbum> getAlbums();
	
	PhotoAlbum getAlbum(Long id);
	
	void synchronize() throws PhotoSynchronizationException;

	PhotoAlbum getLatestAlbum();

}
