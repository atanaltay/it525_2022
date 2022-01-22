package readexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import item.ShoppingItem;

public class ProcessShoppingBasket {

	
	public static void main(String[] args) {
		
		
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("basket.dat"))) {
			
			ShoppingItem item1 = (ShoppingItem)reader.readObject();
			ShoppingItem item2 = (ShoppingItem)reader.readObject();
			ShoppingItem item3 = (ShoppingItem)reader.readObject();
			
			System.out.println(item1);
			System.out.println(item2);
			System.out.println(item3);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
