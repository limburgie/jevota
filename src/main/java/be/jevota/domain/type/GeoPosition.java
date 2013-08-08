package be.jevota.domain.type;

import javax.persistence.Embeddable;

@Embeddable
public class GeoPosition {

	private float latitude;
	private float longitude;

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	public boolean isValid() {
		return latitude != 0f && longitude != 0f;
	}

}
