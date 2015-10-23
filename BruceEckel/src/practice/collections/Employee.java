package practice.collections;

import java.util.Date;

public class Employee implements Comparable<Employee>{
	
	private EmployeeName eName;
	private Integer eNumber; 
	private Date hireDate;
	
	public EmployeeName geteName() {
		return eName;
	}

	public Integer geteNumber() {
		return eNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public Employee(EmployeeName name, int number, Date hireDate) {

		this.eName = new EmployeeName(name.getFirstName(), name.getLastName());
		this.eNumber = number;
		this.hireDate = hireDate;
	}

	//natural ordering of the Employee
	@Override
	public int compareTo(Employee o) {
		return this.eName.compareTo(o.eName);
	}
	
	@Override
	public String toString() {
		@SuppressWarnings("deprecation")
		String date = getHireDate().getDate() + "/" + getHireDate().getMonth() + "/" + (1900+getHireDate().getYear());
		return eName.toString() + "; " + geteNumber() + "; " + date;
	}
}
