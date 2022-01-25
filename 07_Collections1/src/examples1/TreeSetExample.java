package examples1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<String> names = new TreeSet<String>();
		
		names.add("altug");
		names.add("zeynep");
		names.add("altug");
		names.add("mehmet");
		names.add("ayse");
		names.add("ozman");
		names.add("oznur");
		names.add("mehmet");
		names.add("yakup");
		
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
		
	}
	
	
	
}
