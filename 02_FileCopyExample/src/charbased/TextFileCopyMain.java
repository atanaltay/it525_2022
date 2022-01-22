package charbased;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopyMain {

	public static void main(String[] args) {
		
		
		String inputFile = "longtext.txt";
		String outputFile= "longtext_copy.txt";

		
		try(
				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
			) {
			
			String line="";
			while((line=reader.readLine())!=null) {
				
				writer.write(line + "\n");
				
			}
			
			writer.flush();
			System.out.println("File copied!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
