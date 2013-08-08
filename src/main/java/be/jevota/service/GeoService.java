package be.jevota.service;

import be.jevota.domain.Address;
import be.jevota.domain.type.GeoPosition;

public interface GeoService {

	public GeoPosition getGeoPosition(Address address);
	
}
