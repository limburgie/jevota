package be.jevota.repository;

import be.jevota.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

	@Query("FROM Event ORDER BY date DESC")
	List<Event> getAllEvents();
	
}
