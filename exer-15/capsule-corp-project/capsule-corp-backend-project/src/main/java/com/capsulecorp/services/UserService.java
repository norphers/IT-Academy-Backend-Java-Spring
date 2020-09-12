package com.capsulecorp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsulecorp.models.User;
import com.capsulecorp.models.User.Role;
import com.capsulecorp.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User newUser(User user) throws Exception {
		boolean userExists = false;
		List<User> users = userRepository.findAll();
		
		for (User one : users) {
			if (user.getEmail().equals(one.getEmail()) && user.getRole().equals(one.getRole())) 
				userExists = true;
		}

		if (userExists) throw new Exception("This user already exists");
		else return userRepository.save(user);
	}
	
	public List<User> getAll() {
		return userRepository.findAll();
	}

	public List<User> getAllByRole(String role) throws Exception {	
		if (role.equals("admins")) return userRepository.findByRole(Role.ADMIN);
		else if (role.equals("employees")) return userRepository.findByRole(Role.EMPLOYEE);
		else if (role.equals("customers")) return userRepository.findByRole(Role.CUSTOMER); 
		else if (role.equals("consumers")) return userRepository.findByRole(Role.CONSUMER); 
		else throw new Exception("This path variable role isn't accepted");
	}

}
