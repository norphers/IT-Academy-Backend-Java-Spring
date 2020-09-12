package com.capsulecorp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capsulecorp.models.User;
import com.capsulecorp.models.User.Role;

public interface UserRepository extends JpaRepository <User, Long> {
	
	List<User> findByRole(Role role);
	List<? extends User> findByEmailAndRole(String email, Role role);
	

}

