package example1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import item.ShoppingItem;

public class CreateShoppingItems {

	public static void main(String[] args) {
		
		ShoppingItem item1 = new ShoppingItem("apple",2,3);
		ShoppingItem item2 = new ShoppingItem("carrot",1,3);
		ShoppingItem item3 = new ShoppingItem("grapes",2,6);
		
		
		//For serializing Java Objects we use ObjectInputStream and ObjectoutputStream
		
		
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("basket.dat"))) {
			
			writer.writeObject(item1);
			writer.writeObject(item2);
			writer.writeObject(item3);
			
			writer.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
