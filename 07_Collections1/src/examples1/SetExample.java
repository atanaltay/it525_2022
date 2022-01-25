package examples1;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	
	public static void main(String[] args) {
		
		//The standard Set implementation is HashSet
		Set<String> names = new HashSet<String>();
		names.add("ayse");
		names.add("ayse");
		names.add("osman");
		names.add("osman");
		names.add("zeynep");
		names.add("gokay");
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	
	
	
}
