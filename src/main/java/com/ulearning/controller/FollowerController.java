package com.ulearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ulearning.model.User;
import com.ulearning.service.IFollowerService;

//@Controller
@RestController
@RequestMapping("/followers")
public class FollowerController {

	@Autowired
	@Qualifier("followerService")
	private IFollowerService followerService;
	
	@RequestMapping(value="/{userId}", method = RequestMethod.GET)
	public @ResponseBody List<User> getFollowers(@PathVariable Long userId) {// @RequestParam(value="userId", defaultValue="12345") Long userId){
		List<User> followers = followerService.getFollowers(userId);
		//List<User> followers = new ArrayList<>(); 
		User user = new User();
		user.setId(userId);
		user.setName("Osman");
		followers.add(user);
		//return Response.status(200).entity("getFollower is called").build();
		return followers;
	}

	
	public IFollowerService getFollowerService() {
		return followerService;
	}

	public void setFollowerService(IFollowerService followerService) {
		this.followerService = followerService;
	}
	
}
