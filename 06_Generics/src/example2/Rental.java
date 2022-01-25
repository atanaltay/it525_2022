package example2;

public class Rental<T extends Rentable> {

	private T itemToRent;

	public Rental(T itemToRent) {
		super();
		this.itemToRent = itemToRent;
	}



	public void rentOut() {
		System.out.println(itemToRent + " is rented for " + itemToRent.getPrice());
	}
}
