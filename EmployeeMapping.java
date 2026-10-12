package com.example.demo;

public class EmployeeMapping {

	private int id;
	private String name;
	private String email;
	private double salary;
	private String department;
	
	public EmployeeMapping(int id, String name, String email, double salary, String department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}
}