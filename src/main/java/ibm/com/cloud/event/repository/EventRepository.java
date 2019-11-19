package ibm.com.cloud.event.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ibm.com.cloud.event.model.Event;

public class EventRepository {

	private List<Event> events = new ArrayList<>();
	
	public Event add(Event event) {
		event.setName("Rashmi");
		events.add(event);
		return event;
	}
	
	public Event findByName(String name) {
		Optional<Event> event = events.stream().filter(a -> a.getName().equals(name)).findFirst();
		if (event.isPresent())
			return event.get();
		else
			return null;
	}
	
	public List<Event> findAll() {
		return events;
	}
	
	/*
	 * public List<Event> findByDepartment(Long departmentId) { return
	 * events.stream().filter(a ->
	 * a.getDepartmentId().equals(departmentId)).collect(Collectors.toList()); }
	 */
	
	/*
	 * public List<Event> findByOrganization(Long organizationId) { return
	 * events.stream().filter(a ->
	 * a.getOrganizationId().equals(organizationId)).collect(Collectors.toList()); }
	 */
	
}
