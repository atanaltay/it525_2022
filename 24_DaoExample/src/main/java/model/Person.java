package model;

public class Person extends BaseEntity{
	
	private String name, lastname,workphone,address,homephone,email,city,birthdate;
	private int categry_id;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(int id, String name, String lastname, String workphone, String address, String homephone,
			String email, String city, String birthdate, int categry_id) {
		super(id);
		this.name = name;
		this.lastname = lastname;
		this.workphone = workphone;
		this.address = address;
		this.homephone = homephone;
		this.email = email;
		this.city = city;
		this.birthdate = birthdate;
		this.categry_id = categry_id;
	}

	@Override
	public String toString() {
		return name + " " + lastname;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getWorkphone() {
		return workphone;
	}


	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getHomephone() {
		return homephone;
	}


	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public int getCategry_id() {
		return categry_id;
	}


	public void setCategry_id(int categry_id) {
		this.categry_id = categry_id;
	}
	
	
	
	
	

}
