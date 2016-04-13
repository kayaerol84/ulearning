package com.ulearning.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ulearning.service.ITrainingService;

@Controller
public class TrainingController {

	@Autowired
	@Qualifier("trainingService")
	private ITrainingService trainingService;
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)*/
}
