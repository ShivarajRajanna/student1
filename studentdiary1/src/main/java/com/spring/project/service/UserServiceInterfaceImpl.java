package com.spring.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.entity.User;
import com.spring.project.repository.UserRepository;

@Service
public class UserServiceInterfaceImpl implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepository;
	
	

	public UserRepository getUserRepository() {
		return userRepository;
	}


	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	@Override
	public User saveUser(User user) {
		
			return userRepository.save(user);
	}


	@Override
	public User findUser(User user) {
		User user1=userRepository.findByUsername(user.getUsername());
		
		return user1;
	}

}
