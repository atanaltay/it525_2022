package examples1;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	public static void main(String[] args) {
		
		
		
		List<String> names = new ArrayList<String>();
		names.add("altug");
		names.add("altug");
		names.add("mehmet");
		names.add("osman");
		names.add("ayse");
		names.add("zeynep");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println(names.get(2));
		
		System.out.println("------------------");
		
		names.remove("mehmet");
		
		System.out.println(names.get(2));
		
		System.out.println(names.get(names.indexOf("zeynep")));
		
		
	}
	
	
	
}
