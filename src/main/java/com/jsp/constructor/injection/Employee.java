package com.jsp.constructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id;
	String name;
	String email;
	
	public Employee(@Value (value = "123") int id, @Value (value = "James") String name, @Value (value = "james@mail.com") String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void employeeDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}

}
