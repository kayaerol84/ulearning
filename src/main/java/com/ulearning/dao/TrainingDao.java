package com.ulearning.dao;



import com.ulearning.model.Training;

public interface TrainingDao {

	Long save(Training training); //throws DataAccessException;
}
