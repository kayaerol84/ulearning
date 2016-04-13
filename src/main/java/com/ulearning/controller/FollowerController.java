package com.ulearning.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ulearning.service.IFollowerService;

@Controller
//@RestController
@Path("/follower")
public class FollowerController {

	@Autowired
	@Qualifier("followerService")
	private IFollowerService followerService;
	
	@GET
	@Produces("application/json")
	public Response getFollower(Long userId){
		followerService.getFollowers(userId);
		return Response.status(200).entity("getFollower is called").build();
	}

	
	public IFollowerService getFollowerService() {
		return followerService;
	}

	public void setFollowerService(IFollowerService followerService) {
		this.followerService = followerService;
	}
	
}
