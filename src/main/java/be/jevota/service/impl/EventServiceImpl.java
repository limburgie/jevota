package be.jevota.service.impl;

import be.jevota.domain.Event;
import be.jevota.repository.EventRepository;
import be.jevota.service.EventService;
import org.joda.time.DateTime;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class EventServiceImpl implements EventService {

	@Inject private EventRepository repository;

	public Event getEvent(Long id) {
		return repository.findOne(id);
	}

	public List<Event> getAllEvents() {
		return repository.getAllEvents();
	}

	public Event getFirstUpcomingEvent() {
		List<Event> events = getUpcomingEvents();
		if (!events.isEmpty()) {
			return events.get(0);
		}
		return null;
	}

	public List<Event> getUpcomingEvents() {
		return repository.getEventsFromDate(new DateTime().minusDays(1).toDate());
	}

	@Transactional
	public void saveEvent(Event event) {
		repository.save(event);
	}
	
}
