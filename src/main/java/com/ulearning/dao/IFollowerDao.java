package com.ulearning.dao;

import java.util.List;

import com.ulearning.model.Follower;
import com.ulearning.model.User;

public interface IFollowerDao {

	void createFollower(Follower follower); // extends JpaRepository<Follower, Long>{

	void followUser(User user, User teacherOrLearner);

	List<User> getFollowers(Long userId);

	List<User> getFollowedUsers(Long userId);

}
