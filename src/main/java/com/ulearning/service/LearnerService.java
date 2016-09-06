package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Address;
import com.ulearning.model.Learner;

public interface LearnerService {

	public Learner getLearner(Long id);
	public List<Learner> getLearners();
	public Long addLearner(Learner learner);
	public List<Learner> getLearnersByLocation(Address address);
	public Long updateLearner(Learner learner);
}
