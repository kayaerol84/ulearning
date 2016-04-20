package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Ranking;
import com.ulearning.model.User;

public interface IRankingService {
	
	void scoreLearner(User evaluator, User evaluated, Float score);
	void scoreTeacher(User evaluator, User evaluated, Float score);
	void setAverageScore(User evaluatedUser);
	Ranking getRanking(Long id);
	List<Ranking> getRankingsByUser(Long userId);
	List<Ranking> getGivenRankingsByUser(Long userId);	
}
