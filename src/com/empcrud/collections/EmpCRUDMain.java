package com.empcrud.collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpCRUDMain {
	
	public static Set<Employee> employees = new HashSet<Employee>();

	
	public static void addEmployee() throws IOException  {
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		//create Employee
		System.out.println("Enter Employee number: ");
		String empNumber = br.readLine();
		System.out.println("Enter Employee first name: ");
		String empFirstName = br.readLine();
		System.out.println("Enter Employee Last name: ");
		String empLastName = br.readLine();
		System.out.println("Enter Employee salary: ");
		String empSalary = br.readLine();

		
		Employee e = new Employee();
	
		e.setEmpNumber(Integer.parseInt(empNumber));
		e.setEmpFirstName(empFirstName);
		e.setEmpLastName(empLastName);
		e.setEmpSalary(Double.parseDouble(empSalary));
		
		employees.add(e);
	
	}
	public static void deleteEmployee() throws IOException{
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee number to delete: ");
		String empNumber = br.readLine();
		int temp = Integer.parseInt(empNumber);
		
		//way 1
		/*Employee e = new Employee();
		e.setEmpNumber(temp);
		employees.remove(e);*/
		
		// Way 2
		for(Employee e1 : employees) {
			if(e1.getEmpNumber() == temp)
				employees.remove(e1);
		}
		
	}
	public static void updateEmployee() throws IOException{
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee number to update: ");
		String empNumber = br.readLine();
		int temp = Integer.parseInt(empNumber);
		for(Employee e1 : employees) {
			if(e1.getEmpNumber() == temp) {
		System.out.println("Enter Employee new first name: ");
		String empFirstName = br.readLine();
		System.out.println("Enter Employee new Last name: ");
		String empLastName = br.readLine();
		System.out.println("Enter Employee new salary: ");
		String  empSalary = br.readLine();
		e1.setEmpFirstName(empFirstName);
		e1.setEmpLastName(empLastName);
		e1.setEmpSalary(Double.parseDouble(empSalary));
		
		}
		else
			System.out.println("entered employee number is not available");
			
			
//		Employee e = new Employee();
//	
//		e.setEmpNumber(Integer.parseInt(eno1));
//		e.setEmpFirstName(efname);
//		e.setEmpLastName(elname);
//		e.setEmpSalary(Double.parseDouble(esal));
//		
//		employees.add(e);
//		
	
		}
		
		
	}
	
		public static void readEmployee() throws IOException {
			BufferedReader br = null;
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee number to read: ");
			String empNumber = br.readLine();
			int temp = Integer.parseInt(empNumber);
			
			for(Employee e1 : employees) {
				if(e1.getEmpNumber() == temp)
					System.out.println(e1);
			}
		}
	
		
		public static void showEmploees() throws IOException {
		
			System.out.println("show all employees: " );

			for(Employee e1 : employees) {
			
					System.out.println(e1);
			}
			
		}
		
		public static void existedEmployee() throws IOException{
			BufferedReader br = null;
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee number to add : ");
			String empNumber = br.readLine();
			int temp = Integer.parseInt(empNumber);
			for(Employee e1 : employees) {
				if(e1.getEmpNumber() == temp) {
					System.out.println("entered employee number is already existed");
					
				}
			}
		}
  
		public static void sortingEmployees() throws IOException{
			
		List<Employee> list = new ArrayList<Employee>(employees);
		Collections.sort(list);
		System.out.println("Elements After Sorting:");
		for(Employee e1 : list) {
			
		System.out.println(e1);
		
		
		}
		}
		
		public static void printEmployees(List<Employee> emps) {
			for(Employee e1 : emps) {
				System.out.println(e1);
				}
		}
		
		
		
	public static void main(String[] args) {
		
		BufferedReader  br = null;
		
	        try {
	        
	        	br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Welcom to tcs");
	            while (true) {
	            	
	            	
	            	System.out.println("[1] - Create Employee");
	            	System.out.println("[2] - Delete Employee");
	            	System.out.println("[3] - Read Employee ");
	            	System.out.println("[4] - Show All Employees ");
	            	System.out.println("[5] - Show All Employees sort by Empno ");
	                System.out.println("[6] - Update Employee ");
	                System.out.println("[7] - Existed Employee ");
	                
	                System.out.println("[8] - Show Employee sort by FirstName ");
	                System.out.println("[9] -Show Employee sort by LastName ");
	                System.out.println("[10] -Show Employee sort by Salary ");
	                
	            	
	            	System.out.println("Enter your option: ");
	            	String option = br.readLine();
	            	
	            	switch(Integer.parseInt(option)) {
	            	
	            	case 1:
	            				
	            				addEmployee();	
	            				break;
	            				
	            	case 2:
	            				//Delete Employee
	            				deleteEmployee();
	            				break;
	            	case 3: 
	            		      readEmployee();
	            		      break;
	            				
	            	case 4:
	            		      showEmploees();
	            		      break;
	            		
	            	case 5:
	            		      sortingEmployees();
	            		      break;
	            	case 6: 
	            		      updateEmployee();
     		                  break;
     		                  
	            	case 7: 
	            		
	            		     existedEmployee();
	            		     break;
	            		
	            	case 8:
	            				List<Employee>  emps = new ArrayList<Employee>(employees);
	            				Collections.sort(emps, new FirstNameComparator());
	            				printEmployees(emps);
	            				
	            	case 9:
		        				List<Employee>  emps1 = new ArrayList<Employee>(employees);
		        				Collections.sort(emps1, new LastNameComparator());
		        				printEmployees(emps1);
        				
	            	case 10:
			            		List<Employee>  emps2 = new ArrayList<Employee>(employees);
		        				Collections.sort(emps2, new SalaryComparator());
		        				printEmployees(emps2);
        				
        				
	            	default:
	            				break;
	            	
	            	
	            	}
						
					
	            }

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
	            }
	        }
	        
	       
	        

	    }


}
