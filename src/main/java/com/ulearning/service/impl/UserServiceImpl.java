package com.ulearning.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IUserDao;
import com.ulearning.model.Address;
import com.ulearning.model.Role;
import com.ulearning.model.Skill;
import com.ulearning.model.User;
import com.ulearning.service.IUserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

	@Inject
	private IUserDao userDao;
	
	public User getUser(Long userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User userDto) {
		// TODO Auto-generated method stub

	    User user = new User();
	    user.setName("Erol");
	    user.setSurname("Shaban");
	     
	    user.setPassword(passwordEncoder.encode("DonCarleone"));
	     
	    user.setEmail("vitocarleone@gmail.com");
	    
	    List<Role> roles = new ArrayList<>();
	    roles.add(new Role("ROLE_ADMIN"));
	    user.setRoles(roles);
	    return userDao.save(user);
	}
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public List<User> getUsersByLocation(Address location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersBySkill(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidUser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public User addUser(Long userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
