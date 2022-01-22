package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProcessShoppingBasket {

	public static void main(String[] args) {
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader("shoppingbasket.csv"));
			 BufferedWriter writer = new BufferedWriter(new FileWriter("shoppingreport.txt"));
				
				) {
			
			double sum = 0;
			int linecount = 0;
			
			String line = "";
			while((line=reader.readLine())!=null) {
				
				String[] parts = line.split(":");
				int quantity = Integer.valueOf(parts[1]);
				double unitprice = Double.valueOf(parts[2]);
				sum+= unitprice*quantity;
				linecount++;
				
			}
			
			String statement = "------------REPORT-------------\n";
			statement += "Total Amount\t:" + sum + " TL\n";
			statement += "Number of items\t:" + linecount + "\n";
			statement+="-----------------------------";
			
			writer.write(statement);
			writer.flush();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
