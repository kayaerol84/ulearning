package com.ulearning.controller;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ulearning.service.ILearnerService;

@Controller
public class LearnerController {

	@Autowired
	@Qualifier("learnerService")
	private ILearnerService learnerService;
	
	@RequestMapping(value="/getLearner")
	@Produces("application/json")
	public String findLearner(Model input) {
		input.addAttribute("message", "Dummy Learner");
		return "learner";
	}
	
	
}
