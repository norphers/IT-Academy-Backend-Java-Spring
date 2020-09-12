package com.capsulecorp.models;

public class Consumer extends User{
	
	public Consumer() {
		this.setRole(Role.CONSUMER);
	}

	public Consumer(String firstName, String lastName, String email, String password, Role role) {
		super(firstName, lastName, email, password, Role.CONSUMER);
	}

}
