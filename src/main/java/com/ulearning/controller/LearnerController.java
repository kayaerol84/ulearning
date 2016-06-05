package com.ulearning.controller;

import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ulearning.model.Address;
import com.ulearning.model.Learner;
import com.ulearning.service.ILearnerService;

@Controller
@RequestMapping(value="/learner")
public class LearnerController {

	@Autowired
	@Qualifier("learnerService")
	private ILearnerService learnerService;
	
	@RequestMapping(value="/{userid}", method = RequestMethod.GET)
	@Produces("application/json") 
	public @ResponseBody Learner findLearner(@PathVariable Long userId) {

		return learnerService.getLearner(userId);
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public @ResponseBody Long createLearner(@PathVariable Learner learner) {

		return learnerService.addLearner(learner);
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public @ResponseBody List<Learner> findLearners(@PathVariable Address location) {

		return learnerService.getLearnersByLocation(location);
	}
	
	// TODO userid or username
	@RequestMapping(value="/edit/{userId}", method = RequestMethod.PUT)
	@ResponseBody 
	public void updateLearner(@PathVariable Learner learner) {

		Long learnerId = learnerService.updateLearner(learner);
		
		//return learner.getId();
	    // return "redirect:/learner";
	}
	
	
}
