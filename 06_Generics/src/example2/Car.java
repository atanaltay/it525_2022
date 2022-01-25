package example2;

public class Car implements Rentable{

	private String owner;

	public Car(String owner) {
		super();
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	@Override
	public String toString() {
		return owner + "'s car"; 
	}

	@Override
	public double getPrice() {
		return 1000;
	}
	
	
	
}
