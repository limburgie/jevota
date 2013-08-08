package be.jevota.service;

import java.util.List;

import be.jevota.domain.PingpongClub;

public interface ClubService {

	public static final String JEVOTA_NUMBER = "031";
	
	void saveClub(PingpongClub club);

	List<PingpongClub> getClubs();

	PingpongClub getClub(Long id);

	PingpongClub getJevotaClub();

}
