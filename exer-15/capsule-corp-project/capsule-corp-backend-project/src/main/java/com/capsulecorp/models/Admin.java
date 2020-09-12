package com.capsulecorp.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admins")
public class Admin extends User {
	
	public Admin() {
		this.setRole(Role.ADMIN);
	}

	public Admin(String firstName, String lastName, String email, String password, Role role) {
		super(firstName, lastName, email, password, Role.ADMIN);
	}
}
