package com.guava.practice.cache;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
class Employee {
	private int id;
	private String name;
	public Employee(int id, String name) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
