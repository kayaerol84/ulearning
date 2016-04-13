package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.ITrainingDao;
import com.ulearning.model.Learner;
import com.ulearning.service.ILearnerService;
import com.ulearning.service.ITrainingService;

@Service
@Transactional
public class TrainingServiceImpl implements ITrainingService{

	@Autowired
	private ITrainingDao trainingDao;
	
	 

}
