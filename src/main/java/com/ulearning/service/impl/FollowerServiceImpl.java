package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IFollowerDao;
import com.ulearning.model.Follower;
import com.ulearning.model.Learner;
import com.ulearning.model.Teacher;
import com.ulearning.model.User;
import com.ulearning.service.IFollowerService;

@Service("followerService")
@Transactional
public class FollowerServiceImpl implements IFollowerService{

	@Autowired
	private IFollowerDao followerDao;
	
	@Override
	public void createFollower(Follower follower) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void followTeacher(User user, Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void followLearner(User user, Learner learner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getFollowers(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getFollowedUsers(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public IFollowerDao getFollowerDao() {
		return followerDao;
	}

	public void setFollowerDao(IFollowerDao followerDao) {
		this.followerDao = followerDao;
	}
	
	

}
