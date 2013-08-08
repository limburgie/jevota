package be.jevota.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.apache.commons.lang.StringUtils;

import be.jevota.domain.type.GeoPosition;

@Embeddable
public class Address {

	private static final String BELGIE = "België";

	@Column(name="building")
	private String name;
	private String street;
	private String postalCode;
	private String place;
	private String country = BELGIE;

	@Embedded private GeoPosition position = new GeoPosition();

	public String getFullAddress() {
		return getFullAddress("<br/>");
	}
	
	public String getFullAddress(String separator) {
		String fullPlace = getFullPlace();
		List<String> addressParts = new ArrayList<String>();
		if (!StringUtils.isBlank(street)) {
			addressParts.add(street);
		}
		if (!StringUtils.isBlank(fullPlace)) {
			addressParts.add(fullPlace);
		}
		if (!StringUtils.isBlank(country) && !StringUtils.strip(country).equals(BELGIE)) {
			addressParts.add(country);
		}
		return StringUtils.join(addressParts, separator);
	}

	public String getFullPlace() {
		List<String> addressParts = new ArrayList<String>();
		if (!StringUtils.isBlank(postalCode)) {
			addressParts.add(postalCode);
		}
		if (!StringUtils.isBlank(place)) {
			addressParts.add(place);
		}
		return StringUtils.join(addressParts, " ");
	}

	public GeoPosition getPosition() {
		if(position == null) {
			position = new GeoPosition();
		}
		return position;
	}

	public void setPosition(GeoPosition position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

}
