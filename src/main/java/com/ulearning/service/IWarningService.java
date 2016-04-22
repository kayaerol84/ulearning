package com.ulearning.service;

public interface IWarningService {

	void warnTeacher(Long teacherId, String message, String reason);
	void warnLearner(Long learnerId, String message, String reason);
	
}
