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
	private String month;
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Event() {

	}
	
	public Event(String name, String birthday, String email, String month) {
		
		this.name = name;
		this.birthday = birthday;
		this.email = email;
		this.month = month;
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
		return "Event [ name=" + name + ", birthday=" + birthday +",  email=" + email + ",  month=" + month + "]";
	}

}
