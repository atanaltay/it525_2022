package slowreadwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleCaracterReadingWritingWithEncoding {

	
	
	public static void main(String[] args) {
		
		// Car based - > Reader /writer --> FileReader /FileWriter
		
		//"/Users/atanaltay/Desktop/samp.txt"
		
		
		//Read example
		FileReader reader = null;
		
		try {
			reader = new FileReader("/Users/atanaltay/Desktop/sample3.txt");
			  
			  int c =0;
			  
			  while((c=reader.read())!=-1) {
			  
			  System.out.print(((char)c)); }
			  
			  System.out.println("En of file!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		
		//Write example
		
		/*
		 * FileWriter writer = null; try { writer = new
		 * FileWriter("/Users/atanaltay/Desktop/sample3.txt");
		 * writer.write("çşşğğüüii\\nÖÖööÇÇççŞŞŞşşşüüÜÜğğğĞĞĞ\\nali veli ayşe kaan..");
		 * writer.flush(); System.out.println("File written.."); } catch (IOException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }finally { try {
		 * writer.close(); } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
		
		
		
	}
	
	
	
}
