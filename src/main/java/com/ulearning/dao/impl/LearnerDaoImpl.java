package com.ulearning.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ulearning.dao.IFollowerDao;
import com.ulearning.dao.ILearnerDao;
import com.ulearning.model.Training;

@Repository("learnerDao")
public class LearnerDaoImpl implements ILearnerDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

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

	
}
