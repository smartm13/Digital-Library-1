package com.cd.coe.dao;


import com.cd.coe.model.User;

public interface UserDao {

	

	void saveUser(User user);
	public boolean checkLogin(String userName, String userPassword);
	
}