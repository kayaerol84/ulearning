package com.ulearning.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ulearning.model.Training;
import com.ulearning.model.User;
import com.ulearning.service.IRequestService;

@Controller
@Path("/request")
public class RequestController {

	@Autowired
	private IRequestService requestService;	
	
	@GET
	@Produces("application/json")
	public Response requestTraining(Long userId, Long trainingId){
		// TODO think about it
		requestService.requestTraining(new User(), new Training(null, null, null));
		return Response.status(200).entity("getFollower is called").build();
	}
}
