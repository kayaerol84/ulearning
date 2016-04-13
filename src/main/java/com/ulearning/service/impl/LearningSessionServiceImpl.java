package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.ILearningSessionDao;
import com.ulearning.model.Learner;
import com.ulearning.model.LearningSession;
import com.ulearning.service.ILearnerService;
import com.ulearning.service.ILearningSessionService;

@Service
@Transactional
public class LearningSessionServiceImpl implements ILearningSessionService{

	@Autowired
	private ILearningSessionDao learningSessionDao;

	@Override
	public void createNewSession(LearningSession session) {
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
	
	

}
