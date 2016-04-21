package com.ulearning.delegate;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulearning.service.IUserService;

@Service("loginDelegate")
public class LoginDelegate
{
	@Autowired
	private IUserService userService;

	
	public boolean isValidUser(String username, String password) throws SQLException
	{
	    return userService.isValidUser(username, password);
	}


	public IUserService getUserService() {
		return userService;
	}


	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
