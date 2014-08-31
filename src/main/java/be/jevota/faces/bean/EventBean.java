package be.jevota.faces.bean;

import be.jevota.domain.Event;
import be.jevota.faces.FacesUtil;
import be.jevota.service.EventService;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Named @Scope("view")
public class EventBean implements Serializable {

	@Inject private EventService eventService;
	@Inject private AccountBean accountBean;

	private Event event;
	private List<Event> events;
	private List<Event> upcomingEvents;
	private String redirect;

	@PostConstruct
	public void init() {
		String eventId = FacesUtil.getRequestParam("eventId");
		redirect = FacesUtil.getRequestParam("redirect");
		if(redirect == null) {
			redirect = "/pages/events.xhtml?faces-redirect=true";
		}
		if (eventId != null) {
			event = eventService.getEvent(Long.valueOf(eventId));
		} else {
			event = new Event();
		}
	}

	public boolean isNewEvent() {
		return event.getId() == null;
	}

	public List<Event> getEvents() {
		if(events == null) {
			events = eventService.getAllEvents();
		}
		return events;
	}

	public List<Event> getUpcomingEvents() {
		if(!isNewEvent()) {
			return Collections.singletonList(event);
		}
		if (upcomingEvents == null) {
			upcomingEvents = eventService.getUpcomingEvents();
		}
		return upcomingEvents;
	}

	public String save() {
		if(!accountBean.isEventMgr()) {
			return FacesUtil.unauthorizedError();
		}
		eventService.saveEvent(event);
		FacesUtil.info("Evenement werd succesvol opgeslagen!");
		return redirect;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}
