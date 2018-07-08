package com.shine.hibernate.HibernateDemo;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {

	private String firstName;
	private String lastName;
	private String middleName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	@Override
	public String toString() {
		return "StudentName [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}
}
