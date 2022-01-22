package reademployees;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import hr.Employee;

public class ReadEmpsMain {

	
	public static void main(String[] args) {
		
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("alldata.dat"))) {
			
			ArrayList<Employee> employees =  (ArrayList<Employee>)reader.readObject();
			
			for (Employee employee : employees) {
				System.out.println(employee);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
