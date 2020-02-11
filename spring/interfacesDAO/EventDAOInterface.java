package ttps.spring.interfacesDAO;

import ttps.spring.model.Event;

public interface EventDAOInterface extends GenericDAOInterface<Event> {
	 public Event recuperarEvent(Long id);
	}
