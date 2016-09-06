package com.ulearning.dao;

import java.util.List;

import com.ulearning.model.Address;
import com.ulearning.model.Learner;

public interface LearnerDao {

	void save(Learner learner);
	void update(Learner learner);
	Learner get(Long id);
	List<Learner> getLearnersByLocation(Address location);
	List<Learner> getLearnersByName(String name);
	
}
