package example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class ReadCustomers1 {

	
	
	public static void main(String[] args) {
		
		Path path1= Paths.get("all_customers.txt");
		Path path2= Paths.get("all_customers_copy.txt");
		
		System.out.println(path1.getFileName());
		System.out.println(path1.toAbsolutePath());
		/*
		
		try {
			Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Loads all data in the memory
		/*
		try {
			List<String> lines = Files.readAllLines(path1);
			
			lines.forEach(line-> System.out.println(line));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		try {
			Files.newBufferedReader(path1)
			.lines().forEach(line->System.out.println(line));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
