package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.ILearnerDao;
import com.ulearning.model.Learner;
import com.ulearning.service.ILearnerService;

@Service
@Transactional
public class LearnerServiceImpl implements ILearnerService{

	@Autowired
	private ILearnerDao learnerDao;
	
	public Learner getLearner(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Learner> getLearners() {
		// TODO Auto-generated method stub
		return null;
	}

}
