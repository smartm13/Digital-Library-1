package com.cd.coe.service;


import com.cd.coe.model.User;



public interface UserService {
	
	void saveUser(User user);
	public boolean checkLogin(String userName, String userPassword);
	
}

