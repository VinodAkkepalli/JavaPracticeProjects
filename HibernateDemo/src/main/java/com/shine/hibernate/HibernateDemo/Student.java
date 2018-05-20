package com.shine.hibernate.HibernateDemo;

import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Student {

	@Id
	private int rollNumber;
	private String name;

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
}
