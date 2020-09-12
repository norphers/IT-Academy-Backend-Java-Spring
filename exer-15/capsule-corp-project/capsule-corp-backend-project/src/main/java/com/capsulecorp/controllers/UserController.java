package com.capsulecorp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capsulecorp.models.User;
import com.capsulecorp.services.UserService;

@CrossOrigin("http:/localhost:4200")
@RequestMapping("/api")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> getAll() {
		return userService.getAll();
	}
	
	@GetMapping("/users/{role}")
	public List<User> getAll(@PathVariable String role) throws Exception {
		return userService.getAllByRole(role);
	}
	
	@PostMapping("/users")
	public User newUser(@RequestBody User user) throws Exception {
		return userService.newUser(user);
	}
	

}
