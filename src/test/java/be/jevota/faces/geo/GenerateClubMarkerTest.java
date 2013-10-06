package be.jevota.faces.geo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.primefaces.model.map.Marker;

import be.jevota.domain.Address;
import be.jevota.domain.PingpongClub;
import be.jevota.domain.type.GeoPosition;
import be.jevota.faces.geo.exception.CannotCreateMarkerException;

public class GenerateClubMarkerTest {

	private ClubMarkerGenerator converter;
	private PingpongClub club;
	
	@Before
	public void setup() {
		converter = new ClubMarkerGenerator();
		club = new PingpongClub();
		club.setName("T.T.C. Knudde");
	}
	
	@Test(expected=CannotCreateMarkerException.class)
	public void testClubWithNoAddressThrowsException() throws CannotCreateMarkerException {
		converter.generateMarker(club);
	}
	
	@Test(expected=CannotCreateMarkerException.class)
	public void testClubWithNoPositionThrowsException() throws CannotCreateMarkerException {
		Address address = new Address();
		club.setAddress(address);
		converter.generateMarker(club);
	}
	
	@Test(expected=CannotCreateMarkerException.class)
	public void testClubWithInvalidPositionThrowsException() throws CannotCreateMarkerException {
		Address address = new Address();
		GeoPosition pos = new GeoPosition();
		address.setPosition(pos);
		club.setAddress(address);
		converter.generateMarker(club);
	}
	
	@Test
	public void testNormalClub() throws CannotCreateMarkerException {
		Address address = new Address();
		GeoPosition pos = new GeoPosition();
		pos.setLatitude(123f);
		pos.setLongitude(456f);
		address.setPosition(pos);
		club.setAddress(address);
		
		Marker marker = converter.generateMarker(club);
		assertEquals(123f, marker.getLatlng().getLat(), 0.1f);
		assertEquals(456f, marker.getLatlng().getLng(), 0.1f);
		assertEquals("T.T.C. Knudde", marker.getTitle());
		
	}
	
}
