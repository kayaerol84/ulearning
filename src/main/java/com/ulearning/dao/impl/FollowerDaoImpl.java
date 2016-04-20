package com.ulearning.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IFollowerDao;
import com.ulearning.model.Training;

@Repository("followerDao")
@Transactional
public class FollowerDaoImpl implements IFollowerDao {

	@Autowired  
	SessionFactory sessionFactory;  
	 
	private Session currentSession;   
	
	private Transaction currentTransaction;

	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}
	
	

	public Long save(Training training) {

		// after save, return generated ID
		Session currentSession = sessionFactory.getCurrentSession();  
	    currentSession.saveOrUpdate(training);  

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
