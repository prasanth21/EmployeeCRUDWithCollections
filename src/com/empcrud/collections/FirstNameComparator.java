package com.empcrud.collections;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee>  {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEmpFirstName().compareTo(e2.getEmpFirstName());
	
	}


}
