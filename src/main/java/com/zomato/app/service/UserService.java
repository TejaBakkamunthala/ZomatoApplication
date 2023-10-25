package com.zomato.app.service;

import java.math.BigDecimal;
import java.util.List;

import com.zomato.app.Entity.User;

public interface UserService {

	User updateUser(User user);

	User save(User user);

	User getUserById(long userId) throws Exception;

	void deleteUserById(long userId) throws Exception;
   
//	public void insertUser();
	
}
