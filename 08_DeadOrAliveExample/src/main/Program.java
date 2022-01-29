package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Map<Integer, Integer> statusData = new HashMap<Integer, Integer>();
		List<String> deadCustomers = new ArrayList<String>();
		List<String> aliveCustomers = new ArrayList<String>();
		
		try (BufferedReader readerStatus = new BufferedReader(new FileReader("dead_customers.txt"))) {
			
			String line="";
			while((line=readerStatus.readLine())!=null) {
				
				String[] parts =  line.split(":");
				int custId = Integer.valueOf(parts[0]); 
				int status = Integer.valueOf(parts[1]); 
				 statusData.put(custId, status);
				
			}
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try (BufferedReader readerCustomers = new BufferedReader(new FileReader("all_customers.txt"))) {
			
			String line="";
			while((line=readerCustomers.readLine())!=null) {
				String[] parts = line.split(":");
				int custId = Integer.valueOf(parts[0]);
				int status = statusData.get(custId);
				
				if(status==1) {
					deadCustomers.add(line);
				}else {
					
					aliveCustomers.add(line);
					
				}

			}
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Dead count:" + deadCustomers.size());
		System.out.println("Alive count:" + aliveCustomers.size());
		
		try (BufferedWriter deadWriter = new BufferedWriter(new FileWriter("dead.txt"));
				BufferedWriter aliveWriter = new BufferedWriter(new FileWriter("alive.txt"))) {
			
			for (String line : aliveCustomers) {
				aliveWriter.write(line + "\n");
			}
			
			for (String line : deadCustomers) {
				deadWriter.write(line + "\n");
			}
			
			aliveWriter.flush();
			deadWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done!!");
		
	}
	
	
	
	
}
