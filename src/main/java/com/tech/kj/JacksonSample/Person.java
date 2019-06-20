package com.tech.kj.JacksonSample;

import javax.validation.constraints.NotNull;

public class Person {
	String name;
	int age;	
	EmployeeType employeeType;
    @NotNull
	Address address;
    
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", employeeType=" + employeeType + ", address=" + address
				+ "]";
	}

	

}
