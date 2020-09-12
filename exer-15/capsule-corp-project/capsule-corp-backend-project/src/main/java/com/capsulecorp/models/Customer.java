package com.capsulecorp.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer extends User {
	
	public Customer() {
		this.setRole(Role.CUSTOMER);
	}

	public Customer(String firstName, String lastName, String email, String password, Role role) {
		super(firstName, lastName, email, password, Role.CUSTOMER);
	}

}
