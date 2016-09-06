package com.ulearning.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ulearning.model.LearningSession;
import com.ulearning.service.LearningSessionService;

@Controller
public class LearningSessionController {

	@Autowired
	@Qualifier("learningSessionService")
	private LearningSessionService learningSessionService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public LearningSession getLearningSession(){
		return null;
	}
}
