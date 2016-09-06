package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.TrainingDao;
import com.ulearning.model.Address;
import com.ulearning.model.Field;
import com.ulearning.model.Learner;
import com.ulearning.model.LearningSession;
import com.ulearning.model.Teacher;
import com.ulearning.model.Training;
import com.ulearning.service.LearnerService;
import com.ulearning.service.TrainingService;

@Service("trainingService")
@Transactional
public class TrainingServiceImpl implements TrainingService{

	@Autowired
	private TrainingDao trainingDao;

	@Override
	public void addTraining(Training training) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTraining(Training training) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Training getTraining(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Training> getTrainingsByLocation(Address location, Boolean available) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Training> getTrainingsByLocationAndField(Address location, Field field, Boolean available) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Training> getTrainingsByTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LearningSession> getTrainingSessions(Long trainingId) {
		// TODO Auto-generated method stub
		return null;
	}

	public TrainingDao getTrainingDao() {
		return trainingDao;
	}

	public void setTrainingDao(TrainingDao trainingDao) {
		this.trainingDao = trainingDao;
	}
	
	 

}
