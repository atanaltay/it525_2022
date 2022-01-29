package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainSort {

	
	
	public static void main(String[] args) {
		
		
		List<String> cities = new ArrayList<String>();
		cities.add("istanbul");
		cities.add("ankara");
		cities.add("izmir");
		cities.add("zonguldak");
		cities.add("mersin");
		
	
		
		//Collections
		
		Collections.sort(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println("----------------");
		Collections.shuffle(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}
	
		
		
	}
	
	
	
}
