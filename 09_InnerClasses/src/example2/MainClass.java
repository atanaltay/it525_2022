package example2;

public class MainClass {

	public static void main(String[] args) {
		Chef chef = new Chef("altug");
		
		// the standard way
		chef.cookFood(new Apple());
		
		//anonymous inner class way:

		chef.cookFood(new Cookable() {
			
			@Override
			public String getCooked() {
				return "chicken soup";
			}
		});
		
		//lamda way:
		
		chef.cookFood(()->"Meatball grill");
		
		
	}
	
	
	
	
}
