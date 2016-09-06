package com.ulearning.service;

public interface WarningService {

	void warnTeacher(Long teacherId, String message, String reason);
	void warnLearner(Long learnerId, String message, String reason);
	
}
