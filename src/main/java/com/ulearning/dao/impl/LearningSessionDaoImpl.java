package com.ulearning.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ulearning.dao.FollowerDao;
import com.ulearning.dao.LearningSessionDao;
import com.ulearning.model.LearningSession;
import com.ulearning.model.Training;

@Repository("learningSessionDao")
public class LearningSessionDaoImpl implements LearningSessionDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	SessionFactory sessionFactory;

	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}

	public Long save(LearningSession training) {

		// after save, return generated ID
		return 0L;
	}

	public void update(LearningSession learningSession) {
		
		EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(learningSession); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }
	}

	public LearningSession get(Long id) {
		return null;
	}

	
}
