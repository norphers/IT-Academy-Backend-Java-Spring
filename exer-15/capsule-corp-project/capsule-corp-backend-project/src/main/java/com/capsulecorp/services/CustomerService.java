package com.capsulecorp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsulecorp.repositories.UserRepository;

@Service
public class CustomerService {

	@Autowired
	UserRepository userRepository;
}
