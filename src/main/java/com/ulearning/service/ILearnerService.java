package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Address;
import com.ulearning.model.Learner;

public interface ILearnerService {

	public Learner getLearner(Long id);
	public List<Learner> getLearners();
	public void addLearner(Learner learner);
	public List<Learner> getLearnersByLocation(Address address);
	public void updateLearner(Learner learner);
}
