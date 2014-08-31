package be.jevota.repository;

import be.jevota.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

	@Query("FROM Event WHERE date > :fromDate ORDER BY date ASC")
	List<Event> getEventsFromDate(@Param("fromDate") Date fromDate);

	@Query("FROM Event ORDER BY date DESC")
	List<Event> getAllEvents();

}
