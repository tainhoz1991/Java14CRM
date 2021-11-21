package cybersoft.javabackend.java14.crm.entity;

public class User {
	/* properties */
	private int id;
	private String name;
	private String email;
	private String password;
	private String phone;
	private String address;
	private Role role;
	
	/* contructor */
	/**
	 * @param id
	 * @param name
	 * @param mail
	 * @param password
	 * @param phone
	 * @param address
	 * @param role
	 */
	public User(int id, String name, String mail, String password, String phone, String address, Role role) {
		this.id = id;
		this.name = name;
		this.email = mail;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}
	
	public User() {
		
	}
	
	/* getter/setter */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEMail() {
		return email;
	}

	public void setMail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	/* method */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		User user = null;
		
		try {
			user = (User) obj;
		} catch (Exception e) {
			return false;
		}
		
		/* compare email */
		if (this.email.equalsIgnoreCase(user.getEMail()))
			return true;
		
		return false;
	}
	
	
}
