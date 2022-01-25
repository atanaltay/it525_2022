package exmplemaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample1 {

	public static void main(String[] args) {
		
		//Maps create key->value stores
		
		
		Map<String, Integer> cityPopulations = new HashMap<String, Integer>();
		
		//put() to insert a new element
		//Map keys are a set of values
		//map keys are unique
		cityPopulations.put("istanbul", 20000);
		cityPopulations.put("ankara", 5000);
		cityPopulations.put("izmir", 3500);
		cityPopulations.put("antalya", 2000);
		cityPopulations.put("antalya", 1500);
		
		System.out.println(cityPopulations.get("ankara"));
		System.out.println(cityPopulations.get("antalya"));
		
		//cityPopulations.keySet() -> Set(KeyType)
		
		for (String key : cityPopulations.keySet()) {
			System.out.println(key + ":" + cityPopulations.get(key));
			
		}
		
		
		//Sorted Keys
		
		Map<String, Integer> cityPopulationsSorted = new TreeMap<String, Integer>();
		
		//put() to insert a new element
		//Map keys are a set of values
		//map keys are unique
		cityPopulationsSorted.put("istanbul", 20000);
		cityPopulationsSorted.put("ankara", 5000);
		cityPopulationsSorted.put("izmir", 3500);
		cityPopulationsSorted.put("antalya", 2000);
		cityPopulationsSorted.put("antalya", 1500);
		System.out.println("Sorted keys:::::::::::::::");
		System.out.println(cityPopulationsSorted.get("ankara"));
		System.out.println(cityPopulationsSorted.get("antalya"));
		
		//cityPopulations.keySet() -> Set(KeyType)
		
		for (String key : cityPopulationsSorted.keySet()) {
			System.out.println(key + ":" + cityPopulationsSorted.get(key));
			
		}
		
	}
	
	
	
}
