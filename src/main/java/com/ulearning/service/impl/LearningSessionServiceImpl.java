package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.LearningSessionDao;
import com.ulearning.model.Learner;
import com.ulearning.model.LearningSession;
import com.ulearning.service.LearningSessionService;

@Service("learningSessionService")
@Transactional
public class LearningSessionServiceImpl implements LearningSessionService{

	@Autowired
	private LearningSessionDao learningSessionDao;

	@Override
	public void addNewSession(LearningSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LearningSession getLearningSession(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LearningSession> getLearningSessions(Long trainingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLearningSession(LearningSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void joinLearningSession(Long sessionId, Learner learner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leaveLearningSession(Long sessionId, Learner learner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endLearningSession(LearningSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deactiveLearningSession(LearningSession session) {
		// TODO Auto-generated method stub
		
	}

	public LearningSessionDao getLearningSessionDao() {
		return learningSessionDao;
	}

	public void setLearningSessionDao(LearningSessionDao learningSessionDao) {
		this.learningSessionDao = learningSessionDao;
	}
	
	

}
