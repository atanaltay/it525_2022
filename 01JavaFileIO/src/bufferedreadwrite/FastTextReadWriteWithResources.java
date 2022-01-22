package bufferedreadwrite;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


// try-with-resources // after Java 8
public class FastTextReadWriteWithResources {

	
	public static void main(String[] args) {
		//When we want use try-with-resources block
		// the type that must be closed must be inheriting from AutoClosable interface
		
		/*
		try (
				BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"))
				
				) {
			
			writer.write("test test test");
			writer.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		
		try (
				BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
				)
		{
			
			String line="";
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}
