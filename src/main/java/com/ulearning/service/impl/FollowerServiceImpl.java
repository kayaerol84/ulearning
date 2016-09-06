package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.FollowerDao;
import com.ulearning.dao.TeacherDao;
import com.ulearning.model.Follower;
import com.ulearning.model.Learner;
import com.ulearning.model.Teacher;
import com.ulearning.model.User;
import com.ulearning.service.FollowerService;

@Service("followerService")
@Transactional
public class FollowerServiceImpl implements FollowerService{

	@Autowired
	private FollowerDao followerDao;
	
	private TeacherDao teacherDao;
	
	@Override
	public Follower createFollower(Follower follower) {
		// TODO Auto-generated method stub
		return followerDao.createFollower(follower);
	}

	@Override
	public Follower followTeacher(User user, Teacher teacher) {
		// TODO Auto-generated method stub
		return followerDao.followUser(user, teacher);		
	}

	@Override
	public Follower followLearner(User user, Learner learner) {
		// TODO Auto-generated method stub
		return followerDao.followUser(user, learner);
	}

	@Override
	public List<User> getFollowers(Long userId) {
		// TODO Auto-generated method stub

		teacherDao.update(new Teacher());
		return followerDao.getFollowers(userId);
		
	}

	@Override
	public List<User> getFollowedUsers(Long userId) {
		// TODO Auto-generated method stub
		return followerDao.getFollowedUsers(userId);
	}

	public FollowerDao getFollowerDao() {
		return followerDao;
	}

	public void setFollowerDao(FollowerDao followerDao) {
		this.followerDao = followerDao;
	}

	@Override
	public void cancelFollowing(Long userId, Long followedUser) {
		// TODO Auto-generated method stub
		
	}
	
	

}
