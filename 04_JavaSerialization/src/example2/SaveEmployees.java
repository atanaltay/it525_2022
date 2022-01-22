package example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import hr.Employee;

public class SaveEmployees {

	
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee("altug", "tanaltay");
		Employee emp2 = new Employee("mehmet", "emin");
		Employee emp3 = new Employee("ali", "veli");
		
		
		ArrayList<Employee> alldata = new ArrayList<Employee>();
		alldata.add(emp1);
		alldata.add(emp2);
		alldata.add(emp3);
		
		
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("alldata.dat"))) {
			
			writer.writeObject(alldata);
			writer.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
