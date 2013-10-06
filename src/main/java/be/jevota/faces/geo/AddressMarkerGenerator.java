package be.jevota.faces.geo;

import javax.inject.Named;

import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.Marker;

import be.jevota.domain.Address;
import be.jevota.domain.type.GeoPosition;
import be.jevota.faces.geo.exception.CannotCreateMarkerException;

@Named
public class AddressMarkerGenerator {

	public Marker generateMarker(Address address) throws CannotCreateMarkerException {
		if(address == null) {
			throw new CannotCreateMarkerException();
		}
		GeoPosition pos = address.getPosition();
		if(pos == null || !pos.isValid()) {
			throw new CannotCreateMarkerException();
		}
		return new Marker(new LatLng(new Double(pos.getLatitude()), new Double(pos.getLongitude())));
	}
	
}
