package example3;

import java.util.ArrayList;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		ArrayList<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		

		
		feedAnimals(dogs);
		
		feedAnimals(cats);
		
	}
	//wildcard
	public static void feedAnimals(ArrayList<? extends Animal> animals) {
		
		for (Animal animal : animals) {
			animal.getFed();
		}
		
		
	}
	
	
}
