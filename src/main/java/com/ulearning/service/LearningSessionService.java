package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Learner;
import com.ulearning.model.LearningSession;

public interface LearningSessionService {

	void addNewSession(LearningSession session);
	LearningSession getLearningSession(Long id);
	List<LearningSession> getLearningSessions(Long trainingId);
	void updateLearningSession(LearningSession session);
	void joinLearningSession(Long sessionId, Learner learner);
	void leaveLearningSession(Long sessionId, Learner learner);
	void endLearningSession(LearningSession session);
	void deactiveLearningSession(LearningSession session);
}
