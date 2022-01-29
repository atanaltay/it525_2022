package example2;

public class Chef {
	private String chefName;
	
	public Chef(String chefName) {
		this.chefName = chefName;
	}
	
	
	public void cookFood(Cookable cookable) {
		System.out.println("The chef is cooking");
		System.out.println(cookable.getCooked());
	}
	
	
	
	
}
