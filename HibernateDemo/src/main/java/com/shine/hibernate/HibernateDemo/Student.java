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
	private StudentName name;
//	@Transient
//	private String petName;

	public int getRollNumber() {
		return rollNumber;
	}

	public StudentName getName() {
		return name;
	}

	public void setName(StudentName name) {
		this.name = name;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}	
}
