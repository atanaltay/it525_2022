package examples1;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//contract:
		//if o1>o2 ==> return positive
		//if o1<o2 ==> return negative
		//if o1==o2 ==> return 0
		return o1.getLastname().compareTo(o2.getLastname());
	}

}
