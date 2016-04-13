package com.ulearning.dao;



import com.ulearning.model.Training;

public interface ITrainingDao {

	Long save(Training training); //throws DataAccessException;
}
