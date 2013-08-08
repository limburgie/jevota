package be.jevota.service.impl;

import javax.inject.Named;

import be.jevota.domain.Address;
import be.jevota.domain.type.GeoPosition;
import be.jevota.service.GeoService;

import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocoderResult;
import com.google.code.geocoder.model.GeocoderStatus;
import com.google.code.geocoder.model.LatLng;

@Named
public class GeoServiceGoogleImpl implements GeoService {

	public GeoPosition getGeoPosition(Address address) {
		Geocoder geocoder = new Geocoder();
		GeocoderRequest geocoderRequest = new GeocoderRequestBuilder().setAddress(address.getFullAddress(", ")).setLanguage("nl").getGeocoderRequest();
		GeocodeResponse geocoderResponse = geocoder.geocode(geocoderRequest);
		GeoPosition position = new GeoPosition();
		if(geocoderResponse != null && geocoderResponse.getStatus() == GeocoderStatus.OK && !geocoderResponse.getResults().isEmpty()) {
			GeocoderResult result = geocoderResponse.getResults().get(0);
			LatLng latLng = result.getGeometry().getLocation();
			position.setLatitude(latLng.getLat().floatValue());
			position.setLongitude(latLng.getLng().floatValue());
		}
		return position;
	}

}
