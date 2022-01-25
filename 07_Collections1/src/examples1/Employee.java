package examples1;

public class Employee implements Comparable<Employee>{

	private int id;
	private String lastname;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String lastname) {
		super();
		this.id = id;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Hash code called...");
		return id;
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called....");
		if(this.getId()== ((Employee)obj).getId()) {
			return true;
		}
		
		return false;
		
		
	}
	/*
	@Override
	public int compareTo(Employee o) {
		//compareTo contract:
		// if this is greater than o return positive number
		//if this is equal to o, return 0
		//if this is smalller than o , return negative number
		if(this.id>o.getId()) {
			return 1;
		}else if(this.id==o.getId()) {
			return 0;
		}else{
			return -1;
		}

	}
	*/
	
	@Override
	public int compareTo(Employee o) {
		return Integer.valueOf(id).compareTo(o.getId());
	}
	
	
	/*
	@Override
	public int compareTo(Employee o) {
		return this.getLastname().compareTo(o.getLastname());
	}
	*/
	/* reversed order
	@Override
	public int compareTo(Employee o) {
		return -1 *this.getLastname().compareTo(o.getLastname());
	}
	*/
	
	
}
