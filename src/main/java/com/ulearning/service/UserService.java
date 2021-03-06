package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Address;
import com.ulearning.model.Skill;
import com.ulearning.model.User;

public interface UserService {

	User getUser(Long userid);
	User addUser(User user);
	List<User> getUsersByLocation(Address location);
	List<User> getUsersByName(String name);
	List<User> getUsersBySkill(Skill skill);
	boolean isValidUser(String username, String password);
	boolean validateUser(User user);
}
