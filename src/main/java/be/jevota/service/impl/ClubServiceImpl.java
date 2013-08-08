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
		return repository.findByNumber(JEVOTA_NUMBER);
	}

	public List<PingpongClub> getClubs() {
		return repository.getClubsOrderedByName();
	}

	@Transactional
	public void saveClub(PingpongClub club) {
		Address address = club.getAddress();
		address.setPosition(geoService.getGeoPosition(address));
		repository.save(club);
	}
	
}
