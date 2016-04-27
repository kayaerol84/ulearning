package com.ulearning.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IFeedbackDao;
import com.ulearning.model.Feedback;

@Repository("feedbackDao")
@Transactional
public class FeedbackDaoImpl implements IFeedbackDao {

	@Autowired  
	SessionFactory sessionFactory;

	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}
	
	

	public Long save(Feedback feedback) {

		// after save, return generated ID
		Session currentSession = sessionFactory.getCurrentSession();  
	    currentSession.saveOrUpdate(feedback);  

		return 0L;
	}

	public void update(Feedback feedback) {
		
		EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(feedback); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }
	}

	@Override
	public void createFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Feedback> getFeedback(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Feedback> getFeedbacks(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}


}
