package be.jevota.service.impl;

import static org.junit.Assert.assertFalse;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.junit.Ignore;
import org.junit.Test;

import be.jevota.service.PhotoService;
import be.jevota.service.exception.PhotoSynchronizationException;

public class PhotoServiceTest extends ServiceTestCase {

	@Inject PhotoService photoService;
	
	@Test @Ignore
	public void syncTest() throws PhotoSynchronizationException {
		photoService.synchronize();
		assertFalse(photoService.getAlbums().isEmpty());
		assertFalse(photoService.getAlbums().get(0).getPhotos().isEmpty());
	}
	
	@Test @Ignore
	public void doubleSyncIsNoProblemTest() throws PhotoSynchronizationException {
		photoService.synchronize();
		photoService.synchronize();
		assertFalse(photoService.getAlbums().isEmpty());
		assertFalse(photoService.getAlbums().get(0).getPhotos().isEmpty());
		assertFalse(StringUtils.isBlank(photoService.getAlbums().get(0).getName()));
	}
	
}
