package com.empcrud.collections;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>  {

	@Override
	public int compare(Employee e1, Employee e2) {
	/*	if(e1.getEmpSalary() == e2.getEmpSalary())
			return 0;
		else if(e1.getEmpSalary() < e2.getEmpSalary())
			return -1;
		else
			return 1;*/
		
		return Double.compare(e1.getEmpSalary(), e2.getEmpSalary());

	}

	
	
	
}
