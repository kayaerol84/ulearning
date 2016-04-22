package com.ulearning.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IUserDao;
import com.ulearning.model.Address;
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
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

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
