package com.ulearning.dao.impl;

import java.text.MessageFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ulearning.dao.TrainingDao;
import com.ulearning.model.Training;

@Repository("trainingDao")
public class TrainingDaoImpl implements TrainingDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Autowired
	SessionFactory sessionFactory;
	
	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}

	public Long save(Training training) {

		// after save, return generated ID
		return 0L;
	}

	public void update(Training training) {
		
		EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(training); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }
	}

	public Training get(Long id) {
		return null;
	}

	private void validateNotEmpty(String param, String parameterName) {

		validateNoNull(param, parameterName);

		if (param.trim().length() == 0) {
			throw new IllegalArgumentException(
					MessageFormat.format("The {0} can not be null or empty string.", parameterName));
		}
	}

	private void validateNoNull(Object param, String parameterName) {

		if (param == null) {
			throw new IllegalArgumentException(MessageFormat.format("The '{0}' can not be null.", parameterName));
		}
	}
}
