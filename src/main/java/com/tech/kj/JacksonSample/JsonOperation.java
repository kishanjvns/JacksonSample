package com.tech.kj.JacksonSample;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


public class JsonOperation {		
	@JsonInclude(value=Include.NON_NULL)
	String name;
	   int age;	   
	  public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
	EmployeeType employeeType;
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
		return "JsonOperation [name=" + name + ", age=" + age + ", employeeType=" + employeeType + "]";
	}
	
	   
}
