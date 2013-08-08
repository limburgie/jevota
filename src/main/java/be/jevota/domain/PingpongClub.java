package be.jevota.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import be.jevota.domain.interfaces.Markeable;
import be.jevota.service.ClubService;

@Entity
public class PingpongClub implements Markeable {

	@Id @GeneratedValue
	private Long id;

	@Column(unique=true)
	private String number;
	@Column(unique=true)
	private String shortName;
	@Column(unique=true)
	private String name;
	private String phone;
	
	@Embedded
	private Address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMarkerTitle() {
		return name;
	}

	public boolean isLanaken() {
		return ClubService.JEVOTA_NUMBER.equals(number);
	}

	public Address getAddress() {
		if(address == null) {
			address = new Address();
		}
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PingpongClub other = (PingpongClub) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
