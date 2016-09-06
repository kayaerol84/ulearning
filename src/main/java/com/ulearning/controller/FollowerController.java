package com.ulearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ulearning.model.Follower;
import com.ulearning.model.Learner;
import com.ulearning.model.Teacher;
import com.ulearning.model.User;
import com.ulearning.service.FollowerService;
import com.ulearning.service.UserService;

//@Controller
@RestController
public class FollowerController {

	@Autowired
	@Qualifier("followerService")
	private FollowerService followerService;
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/{userId}/followers", method = RequestMethod.GET)
	public @ResponseBody List<User> getFollowers(@PathVariable Long userId) {// @RequestParam(value="userId", defaultValue="12345") Long userId){
		List<User> followers = followerService.getFollowers(userId);
		return followers;
	}
	
	@RequestMapping(value="/{userId}/follow", method = RequestMethod.POST)	
	public @ResponseBody Follower followUser(@PathVariable Long userId, @PathVariable Long followedUser){
		Follower follower = new Follower();
		User user = userService.getUser(userId);
		User followed = userService.getUser(followedUser);
		if (followed instanceof Teacher){
			followerService.followTeacher(user, (Teacher)followed);	
		} else {
			followerService.followLearner(user, (Learner)followed);
		}
		
		return follower;
	}
	
	@RequestMapping(value="/{userId}/cancelFollowing", method = RequestMethod.POST)	
	public @ResponseBody String cancelFollowUser(@PathVariable Long userId, @PathVariable Long followedUser){
		followerService.cancelFollowing(userId, followedUser);
		return "Stopped following" + "userName";
	}

	
	public FollowerService getFollowerService() {
		return followerService;
	}

	public void setFollowerService(FollowerService followerService) {
		this.followerService = followerService;
	}
	
}
