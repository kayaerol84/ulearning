package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Address;
import com.ulearning.model.Field;
import com.ulearning.model.LearningSession;
import com.ulearning.model.Teacher;
import com.ulearning.model.Training;

public interface TrainingService {
	void addTraining(Training training);
	void updateTraining(Training training);
	Training getTraining(Long id);
	List<Training> getTrainingsByLocation(Address location, Boolean available);
	List<Training> getTrainingsByLocationAndField(Address location, Field field, Boolean available);
	List<Training> getTrainingsByTeacher(Teacher teacher);
	List<LearningSession> getTrainingSessions(Long trainingId);
	
}
