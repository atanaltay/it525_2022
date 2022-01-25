package example2;

public class RentalMain {

	public static void main(String[] args) {
		
		Car car = new Car("altug");
		House house = new House("Istanbul");
		
		Rental<Car> carRental  = new Rental<Car>(car);
		
		Rental<House> houseRental = new Rental<House>(house);
		
		carRental.rentOut();
		
		houseRental.rentOut();
		
		
		
		
	}
	
	
	
	
}
