package com.empcrud.collections;

public class Employee implements Comparable<Employee>  {

	int empNumber;
	String empFirstName;
	String empLastName;
	double empSalary;
	
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Eno:" + this.empNumber + " Ename: " + this.empFirstName + " " + this.empLastName + " EmpSal:" + this.empSalary;
	}
	
	@Override
	public int compareTo(Employee e) {
		
		if (this.empNumber == e.getEmpNumber())
			return 0;
		else if (this.empNumber < e.getEmpNumber())
			return -1;
		else 
			return 1;
		
		//return Integer.compare(this.empNumber, e.getEmpNumber());
		
	}
		
	@Override
	public boolean equals(Object obj) {
		return this.empNumber == ((Employee)obj).getEmpNumber();
	}
	
}
