package practice.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 
 * @author VinodAkkepalli
 *
 *	Program to demonstrate the object natural ordering by implementing Comparable interface
 *	https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html
 *
 */


public class EmployeeCollectionsSort {

	//using comparator to sort the employee in seniority order least senior --> most senior
	static final Comparator<Employee> SENIORITY_ORDER = 
			new Comparator<Employee>(){
				public int compare(Employee e1, Employee e2){
					int dateCmp = e2.getHireDate().compareTo(e1.getHireDate());
					if(dateCmp !=0)
						return dateCmp;
					
					return (e1.geteNumber() < e2.geteNumber() ? -1 : e1.geteNumber() == e2.geteNumber() ? 0 : 1);
				}
			};

	//using comparator to sort the employee on employee number
	static final Comparator<Employee> EMPLOYEE_ID = 
			new Comparator<Employee>(){
				public int compare(Employee e1, Employee e2){
					return(e2.geteNumber().compareTo(e1.geteNumber()));
				}
			};
			
	public static void main(String[] args) {

		/**
		 * This part is to manipulate only Employee name related lists
		 */
		
		EmployeeName nameArray[] = {
	            new EmployeeName("John", "Smith"),
	            new EmployeeName("Karl", "Ng"),
	            new EmployeeName("Jeff", "Smith"),
	            new EmployeeName("Tom", "Rich"),
	            new EmployeeName("Vinod", "Akkepalli"),
	        };
		
		System.out.println("Employee names in creation order");
		List<EmployeeName> eNames = Arrays.asList(nameArray);
		System.out.println(eNames);
		
		System.out.println("Employee names in sorted order");
		Collections.sort(eNames);
		System.out.println(eNames);
		
		/**
		 * This part is to manipulate lists containing all details Employees
		 */
		
		Employee empDetails[] = {
				new Employee(new EmployeeName("John", "Smith"), 1000, new GregorianCalendar(96, 10, 25)/*new Date(96, 10, 25)*/),
				new Employee(new EmployeeName("Karl", "Ng"), 1001, new GregorianCalendar(96, 10, 25)),
				new Employee(new EmployeeName("Jeff", "Smith"), 1005, new GregorianCalendar(100, 11, 30)),
				new Employee(new EmployeeName("Tom", "Rich"), 1004, new GregorianCalendar(92, 8, 10)),
				new Employee(new EmployeeName("Vinod", "Akkepalli"), 1002, new GregorianCalendar(115, 2, 15)),
		};
		
		System.out.println("Employee details in order of storage");
		List<Employee> empList = Arrays.asList(empDetails);
		System.out.println(empList);
		
		System.out.println("Employee details sorted on its natural ordering(By Name)");
		Collections.sort(empList);
		System.out.println(empList);
		
		System.out.println("Employee details sorted on seniority(hireDate)");		
		Collections.sort(empList, SENIORITY_ORDER);
		System.out.println(empList);
		
		System.out.println("Employee details sorted on employee number");		
		Collections.sort(empList, EMPLOYEE_ID);
		System.out.println(empList);
		
	}

}