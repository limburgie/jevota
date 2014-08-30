package be.jevota.service;

import be.jevota.domain.Event;

import java.util.List;

public interface EventService {

	Event getEvent(Long valueOf);

	List<Event> getAllEvents();

	void saveEvent(Event event);

}
