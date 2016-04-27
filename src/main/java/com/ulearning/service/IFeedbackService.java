package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Feedback;

public interface IFeedbackService {

	void addFeedback(Feedback feedback);
	Feedback getFeedback(Long id);
	List<Feedback> getFeedbacks(Long userId);
	void warnAdmin(Feedback feedback);
}
