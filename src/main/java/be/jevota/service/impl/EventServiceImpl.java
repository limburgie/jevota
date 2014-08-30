package be.jevota.service.impl;

import be.jevota.domain.Event;
import be.jevota.repository.EventRepository;
import be.jevota.service.EventService;
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

	@Transactional
	public void saveEvent(Event event) {
		repository.save(event);
	}
	
}
