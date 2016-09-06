package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.FeedbackDao;
import com.ulearning.model.Feedback;
import com.ulearning.service.FeedbackService;

@Service("feedbackService")
@Transactional
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	private FeedbackDao feedbackDao;

	
	public FeedbackDao getFeedbackDao() {
		return feedbackDao;
	}

	public void setFeedbackDao(FeedbackDao feedbackDao) {
		this.feedbackDao = feedbackDao;
	}

	@Override
	public Long addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return 0L;
	}

	@Override
	public Feedback getFeedback(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feedback> getFeedbacks(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void warnAdmin(Feedback feedback) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
