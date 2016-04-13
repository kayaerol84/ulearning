package com.ulearning.service;

import java.util.List;

import com.ulearning.model.LearningSession;

public interface ILearningSessionService {

	void createNewSession(LearningSession session);
	LearningSession getLearningSession(Long id);
	List<LearningSession> getLearningSessions(Long trainingId);
	//List<Learner> getActiveLearners(Long id);
	
}
