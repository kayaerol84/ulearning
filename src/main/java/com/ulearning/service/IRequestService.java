package com.ulearning.service;

import com.ulearning.model.Learner;
import com.ulearning.model.Request;
import com.ulearning.model.Teacher;
import com.ulearning.model.Training;
import com.ulearning.model.User;

public interface IRequestService {

	void requestTeacher(User user, Teacher teacher);
	// sacma
	void requestLearner(User user, Learner teacher);
	
	void requestTraining(User user, Training training);
	
	void acceptRequest(User acceptorUser, Request request);
	void rejectRequest(User rejectorUser, Request response);
}
