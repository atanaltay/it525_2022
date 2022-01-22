package hr;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastname;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
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


	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname + "]";
	}
	
	
	
	
}
