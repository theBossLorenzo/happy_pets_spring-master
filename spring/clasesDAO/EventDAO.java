package ttps.spring.clasesDAO;


import org.springframework.stereotype.Repository;

import ttps.spring.model.Event;


@Repository
public class EventDAO extends GenericDao<Event> {

	public EventDAO() {
        super(Event.class);
	}

	public Event persist(Event event) {
		return event;
	}
}
