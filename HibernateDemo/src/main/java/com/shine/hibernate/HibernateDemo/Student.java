package com.shine.hibernate.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column(name="roll_number")
	private int rollNumber;
	@Column(name="student_name")
	private String name;
//	@Transient
//	private String petName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
	
}
