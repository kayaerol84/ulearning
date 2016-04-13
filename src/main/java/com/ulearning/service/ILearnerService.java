package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Learner;

public interface ILearnerService {

	public Learner getLearner(Long id);
	public List<Learner> getLearners();
}
