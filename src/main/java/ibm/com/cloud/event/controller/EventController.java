package ibm.com.cloud.event.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ibm.com.cloud.event.model.Event;
import ibm.com.cloud.event.repository.EventRepository;

@RestController
public class EventController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EventController.class);
	
	@Autowired
	EventRepository repository;
	
	@PostMapping("/")
	public Event add(@RequestBody Event event) {
		LOGGER.info("Event add: {}", event);
		return repository.add(event);
	}
	
	@GetMapping("/{name}")
	public Event findByName(@PathVariable("name") String name) {
		LOGGER.info("Event find: name={}", name);
		return repository.findByName(name);
	}
	
	@GetMapping("/")
	public List<Event> findAll() {
		LOGGER.info("Event find");
		return repository.findAll();
	}
	@GetMapping("/{month}")
	public List<Event> findByMonth(@PathVariable("month") String month) {
		LOGGER.info("Event find: month={}", month);
		return repository.findByMonth(month);
	}
	/*
	 * @GetMapping("/department/{departmentId}") public List<Event>
	 * findByDepartment(@PathVariable("departmentId") Long departmentId) {
	 * LOGGER.info("Employee find: departmentId={}", departmentId); return
	 * repository.findByDepartment(departmentId); }
	 * 
	 * @GetMapping("/organization/{organizationId}") public List<Event>
	 * findByOrganization(@PathVariable("organizationId") Long organizationId) {
	 * LOGGER.info("Employee find: organizationId={}", organizationId); return
	 * repository.findByOrganization(organizationId); }
	 */
}
