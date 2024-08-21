package com.spring.project.service;

import com.spring.project.entity.User;

public interface UserServiceInterface {
	
	public  User saveUser(User user);
	
	public User findUser(User user);

}
