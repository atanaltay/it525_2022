import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class example3 {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<String>();
		
		cities.add("istanbul");
		cities.add("ankara");
		cities.add("izmir");
		cities.add("bursa");
		cities.add("yozgat");
		cities.add("samsun");
		
		
		
		for (String city : cities) {
			System.out.println(city);
		}
		
		System.out.println("------------------");
		
		
		cities.forEach((t)->System.out.println(t));
		
		cities.forEach(t->System.out.println(t));
		
	}
	
	
	
	
	
}
