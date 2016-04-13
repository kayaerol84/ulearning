package com.ulearning.service;

import com.ulearning.model.User;

public interface IRankingService {
	
	void scoreLearner(User evaluator, User evaluated, Float score);
	void scoreTeacher(User evaluator, User evaluated, Float score);
	void setAverageScore(User evaluatedUser);
	
}
