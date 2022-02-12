package model;

public class Category extends BaseEntity{

	private String name;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return name;
	}
	public Category(int id, String name) {
		super(id);
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
