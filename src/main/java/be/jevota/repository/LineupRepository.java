package be.jevota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.jevota.domain.GameLineup;
import be.jevota.domain.PingpongGame;
import be.jevota.domain.PingpongTeam;

public interface LineupRepository extends JpaRepository<GameLineup, Long> {

	GameLineup findByGameAndTeam(PingpongGame game, PingpongTeam team);

}
