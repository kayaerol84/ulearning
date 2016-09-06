package com.ulearning.dao;

import java.util.List;

import com.ulearning.model.Feedback;

public interface FeedbackDao {

	void createFeedback(Feedback feedback); 

	List<Feedback> getFeedback(Long id);

	List<Feedback> getFeedbacks(Long userId);

}
