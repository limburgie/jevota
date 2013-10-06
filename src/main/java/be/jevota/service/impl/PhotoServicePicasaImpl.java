package be.jevota.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import be.jevota.domain.Photo;
import be.jevota.domain.PhotoAlbum;
import be.jevota.repository.PhotoAlbumRepository;
import be.jevota.repository.PhotoRepository;
import be.jevota.service.PhotoService;
import be.jevota.service.exception.PhotoSynchronizationException;

import com.google.gdata.client.photos.PicasawebService;
import com.google.gdata.data.photos.AlbumEntry;
import com.google.gdata.data.photos.AlbumFeed;
import com.google.gdata.data.photos.PhotoData;
import com.google.gdata.data.photos.PhotoEntry;
import com.google.gdata.data.photos.UserFeed;
import com.google.gdata.util.ServiceException;

@Named
public class PhotoServicePicasaImpl implements PhotoService {

	@Inject private PhotoRepository photoRepo;
	@Inject private PhotoAlbumRepository albumRepo;

	public List<PhotoAlbum> getAlbums() {
		return albumRepo.findAll();
	}

	public PhotoAlbum getAlbum(Long id) {
		return albumRepo.findOne(id);
	}

	public PhotoAlbum getLatestAlbum() {
		List<PhotoAlbum> albums = albumRepo.getLatest(new PageRequest(0, 1));
		return albums.isEmpty() ? null : albums.get(0);
	}

	@Transactional
	public void synchronize() throws PhotoSynchronizationException {
		deleteEverything();
		try {
			PicasawebService picasaService = new PicasawebService("jevota.be");
			URL feedUrl = new URL("https://picasaweb.google.com/data/feed/api/user/info@jevota.be?kind=album");
			UserFeed userFeed = picasaService.getFeed(feedUrl, UserFeed.class);
			for (AlbumEntry albumEntry : userFeed.getAlbumEntries()) {
				PhotoAlbum album = new PhotoAlbum();
				album.setName(albumEntry.getTitle().getPlainText());
				album.setDescription(albumEntry.getDescription().getPlainText());
				album.setDate(albumEntry.getDate());
				album.setThumbnailUrl(albumEntry.getMediaThumbnails().get(0).getUrl());
				album.setPhotos(new ArrayList<Photo>());
				AlbumFeed albumFeed = albumEntry.getFeed(PhotoData.KIND);
				for (PhotoEntry photoEntry : albumFeed.getPhotoEntries()) {
					Photo photo = new Photo();
					photo.setDescription(photoEntry.getMediaGroup().getDescription().getPlainTextContent());
					String thumbNailUrl = photoEntry.getMediaThumbnails().get(0).getUrl();
					photo.setThumbnailUrl(thumbNailUrl);
					photo.setUrl(thumbNailUrl.replaceAll("s72", "s800"));
					photo.setAlbum(album);
					album.getPhotos().add(photo);
				}
				albumRepo.save(album);
			}
		} catch (MalformedURLException e) {
			throw new PhotoSynchronizationException(e);
		} catch (IOException e) {
			throw new PhotoSynchronizationException(e);
		} catch (ServiceException e) {
			throw new PhotoSynchronizationException(e);
		}
	}

	private void deleteEverything() {
		photoRepo.deleteAll();
		albumRepo.deleteAll();
	}

}
