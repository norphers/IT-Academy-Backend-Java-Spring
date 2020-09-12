package com.capsulecorp.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee extends User {
	
	public Employee() {
		this.setRole(Role.EMPLOYEE);
	}

	public Employee(String firstName, String lastName, String email, String password, Role role) {
		super(firstName, lastName, email, password, Role.EMPLOYEE);
	}

}
