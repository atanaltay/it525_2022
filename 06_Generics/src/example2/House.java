package example2;

public class House implements Rentable{

	private String city;

	public House(String city) {
		super();
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "The house in " +  city;
	}

	@Override
	public double getPrice() {
		return 5000;
	}
}
