package examples1;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		
		
		Set<Employee> employees = new HashSet<>();
		
		employees.add(new Employee(1, "ahmet"));
		employees.add(new Employee(2, "altug"));
		employees.add(new Employee(3, "ayse"));
		employees.add(new Employee(4, "mehmet"));
		employees.add(new Employee(5, "zeynep"));
		employees.add(new Employee(2, "altug"));
		employees.add(new Employee(1, "ahmet"));
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
	}
	
	
	
}
