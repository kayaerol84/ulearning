package com.ulearning.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ulearning.model.User;
import com.ulearning.service.IUserService;
import com.ulearning.service.impl.UserServiceImpl;

@Controller
@Path("/users")
public class UserController {

	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() {
        UserServiceImpl userService1 = new UserServiceImpl();
        return null; //userService.getDefaultUser();
    }
}
