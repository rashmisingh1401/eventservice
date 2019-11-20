package ibm.com.cloud.event.model;

public class Event {

	/*
	 * private Long id; private Long organizationId; private Long departmentId;
	 */
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String name;
	private String birthday;
	private String email;

	public Event() {

	}
	
	public Event(String name, String birthday, String email) {
		
		this.name = name;
		this.birthday = birthday;
		this.email = email;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Event [ name=" + name + ", birthday=" + birthday +",  email=" + email + "]";
	}

}
