package com.cd.coe.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cd.coe.dao.UserDao;
import com.cd.coe.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		dao.saveUser(user);
	}

	public boolean checkLogin(String userName, String userPassword){
		try{
	     System.out.println("In Service class...Check Login");
	      return dao.checkLogin(userName, userPassword);
	       }
		catch(Exception e)
		{
			return false;
		}}
	

	
}
