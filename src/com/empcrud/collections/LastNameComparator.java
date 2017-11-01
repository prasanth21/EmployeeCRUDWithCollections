package com.empcrud.collections;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee>  {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEmpLastName().compareTo(e2.getEmpLastName());
	
	}

	
	
	
}
