package com.ulearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ulearning.model.Feedback;
import com.ulearning.service.FeedbackService;

//@Controller
@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

	@Autowired
	@Qualifier("feedbackService")
	private FeedbackService feedbackService;
	
	@RequestMapping(value="/{userId}", method = RequestMethod.GET)
	public @ResponseBody List<Feedback> getFeedbacks(@PathVariable Long userId) {// @RequestParam(value="userId", defaultValue="12345") Long userId){
		List<Feedback> feedbacks = feedbackService.getFeedbacks(userId);
		//List<User> followers = new ArrayList<>(); 
		Feedback feedback = new Feedback();
		feedback.setId(userId);
		feedback.setFeedbackText("This teacher sucks. ");
		feedbacks.add(feedback);
		//return Response.status(200).entity("getFollower is called").build();
		return feedbacks;
	}
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public @ResponseBody Feedback getFeedback(@PathVariable Long id) {// @RequestParam(value="userId", defaultValue="12345") Long userId){
		Feedback feedback = feedbackService.getFeedback(id);
		return feedback;
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public @ResponseBody Long createFeedback(@PathVariable Feedback feedback) {// @RequestParam(value="userId", defaultValue="12345") Long userId){
		
		return feedbackService.addFeedback(feedback);
		
	}

	public FeedbackService getFeedbackService() {
		return feedbackService;
	}

	public void setFeedbackService(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	
	
}
