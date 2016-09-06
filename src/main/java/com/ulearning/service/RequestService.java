package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Request;
import com.ulearning.model.Teacher;
import com.ulearning.model.Training;
import com.ulearning.model.User;

public interface RequestService {

	void requestTeacher(User user, Teacher teacher);
		
	void requestTraining(User user, Training training);
	
	void acceptRequest(User acceptorUser, Request request);
	
	void rejectRequest(User rejectorUser, Request response);
	
	Request getRequest(Long requestId);
	
	List<Request> getRequestsByUser(Long userid);
	
	List<Request> getRequestsByTraining(Long trainingId);
}
