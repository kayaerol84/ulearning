package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Follower;
import com.ulearning.model.Learner;
import com.ulearning.model.Teacher;
import com.ulearning.model.User;

public interface IFollowerService {

	void createFollower(Follower follower);
	void followTeacher(User user, Teacher teacher);
	void followLearner(User user, Learner learner);
	List<User> getFollowers(Long userId);
	List<User> getFollowedUsers(Long userId);
}
