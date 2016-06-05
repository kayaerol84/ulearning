package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.ILearnerDao;
import com.ulearning.model.Address;
import com.ulearning.model.Learner;
import com.ulearning.service.ILearnerService;

@Service("learnerService")
@Transactional
public class LearnerServiceImpl implements ILearnerService{

	@Autowired
	private ILearnerDao learnerDao;
	
	@Override
	public Learner getLearner(Long id) {
		// TODO Auto-generated method stub
		return learnerDao.get(id);
	}

	@Override
	public List<Learner> getLearners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long addLearner(Learner learner) {
		// TODO Auto-generated method stub
		return 0L;
	}

	@Override
	public List<Learner> getLearnersByLocation(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateLearner(Learner learner) {
		// TODO Auto-generated method stub
		return 0L;
	}

	public ILearnerDao getLearnerDao() {
		return learnerDao;
	}

	public void setLearnerDao(ILearnerDao learnerDao) {
		this.learnerDao = learnerDao;
	}
}
