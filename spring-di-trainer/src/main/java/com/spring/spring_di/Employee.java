package com.spring.spring_di;

public class Employee {
	
	private String name;
	private int experience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Employee(String name, int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}

}
