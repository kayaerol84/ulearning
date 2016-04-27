package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IFeedbackDao;
import com.ulearning.model.Feedback;
import com.ulearning.service.IFeedbackService;

@Service("feedbackService")
@Transactional
public class FeedbackServiceImpl implements IFeedbackService{

	@Autowired
	private IFeedbackDao feedbackDao;

	
	public IFeedbackDao getFeedbackDao() {
		return feedbackDao;
	}

	public void setFeedbackDao(IFeedbackDao feedbackDao) {
		this.feedbackDao = feedbackDao;
	}

	@Override
	public void addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		
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
