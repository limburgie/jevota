package be.jevota.faces.geo;

import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.Marker;

import be.jevota.domain.Address;
import be.jevota.domain.interfaces.Markeable;
import be.jevota.domain.type.GeoPosition;
import be.jevota.faces.geo.exception.CannotCreateMarkerException;

public abstract class AbstractMarkerGenerator<T extends Markeable> {

	public Marker generateMarker(T markeable) throws CannotCreateMarkerException {
		Address address = markeable.getAddress();
		if(address == null) {
			throw new CannotCreateMarkerException();
		}
		GeoPosition pos = address.getPosition();
		if(pos == null || !pos.isValid()) {
			throw new CannotCreateMarkerException();
		}
		LatLng latlng = new LatLng(pos.getLatitude(), pos.getLongitude());
		return new Marker(latlng, markeable.getMarkerTitle());
	}
	
}
