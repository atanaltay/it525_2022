package examples1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		
		System.out.println("Employees sorted by id");
		Set<Employee> employees = new TreeSet<>();
		
		employees.add(new Employee(10, "ahmet"));
		employees.add(new Employee(20, "altug"));
		employees.add(new Employee(3, "ayse"));
		employees.add(new Employee(4, "mehmet"));
		employees.add(new Employee(5, "zeynep"));
		employees.add(new Employee(20, "altug"));
		employees.add(new Employee(10, "ahmet"));
		
		
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("-------------------");
		System.out.println("Employees sorted by name");
		
		Set<Employee> emps2 
		= new TreeSet<Employee>(new EmployeeNameComparator());
		
		emps2.add(new Employee(10, "ahmet"));
		emps2.add(new Employee(20, "altug"));
		emps2.add(new Employee(3, "ayse"));
		emps2.add(new Employee(4, "mehmet"));
		emps2.add(new Employee(5, "zeynep"));
		emps2.add(new Employee(20, "altug"));
		emps2.add(new Employee(10, "ahmet"));
		
		
		for (Employee employee : emps2) {
			System.out.println(employee);
		}
		
	}
	
	
	
	
}
