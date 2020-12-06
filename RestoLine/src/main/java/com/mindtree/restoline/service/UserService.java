package com.mindtree.restoline.service;

import java.util.Set;

import com.mindtree.restoline.entity.User;

public interface UserService {

	boolean registerUser(User user);

	int checkUser(User user);

	Set<User> getAllUsers();

	User getUserById();

}
