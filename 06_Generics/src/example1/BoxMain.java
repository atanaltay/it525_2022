package example1;

public class BoxMain {

	
	public static void main(String[] args) {
		
		Box<String> nameBox = new Box<>();
		
		nameBox.setItem("mehmet");

		
		System.out.println(nameBox.getItem().getClass().getName());
		
		Box<Integer> intBox = new Box<Integer>();
		
		intBox.setItem(23);
		
		System.out.println(intBox.getItem().getClass().getName());
		
	}
	
	
	
}
