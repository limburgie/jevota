package be.jevota.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import be.jevota.domain.Address;
import be.jevota.domain.PingpongClub;
import be.jevota.repository.ClubRepository;
import be.jevota.service.ClubService;
import be.jevota.service.GeoService;

@Named
public class ClubServiceImpl implements ClubService {

	@Inject private ClubRepository repository;
	@Inject private GeoService geoService;

	public PingpongClub getClub(Long id) {
		return repository.findOne(id);
	}

	public PingpongClub getJevotaClub() {
		return getClubByNumber(JEVOTA_NUMBER);
	}

	public List<PingpongClub> getClubs() {
		return repository.getClubsOrderedByName();
	}

	@Transactional
	public PingpongClub saveClub(PingpongClub club) {
		Address address = club.getAddress();
		if (address != null) {
			address.setPosition(geoService.getGeoPosition(address));
		}
		return repository.save(club);
	}

	public PingpongClub getClubByNumber(String number) {
		return repository.findByNumber(number);
	}

	public PingpongClub getOrCreateClub(String number, String name) {
		PingpongClub club = getClubByNumber(number);
		if (club == null) {
			club = new PingpongClub();
			club.setNumber(number);
			club.setName(name);
			club.setShortName(name);
			club = saveClub(club);
		}
		return club;
	}

}
