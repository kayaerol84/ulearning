package com.ulearning.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IUserDao;
import com.ulearning.model.User;
import com.ulearning.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Inject
	private IUserDao userDao;
	
	public User getUser(Long userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
