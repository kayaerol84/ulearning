package com.ulearning.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ulearning.dao.FollowerDao;
import com.ulearning.dao.PaymentDao;
import com.ulearning.model.Payment;
import com.ulearning.model.Training;

@Repository("paymentDao")
public class PaymentDaoImpl implements PaymentDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	SessionFactory sessionFactory;

	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}

	public Long save(Payment payment) {

		// after save, return generated ID
		return 0L;
	}

	public void update(Payment payment) {
		
		EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(payment); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }
	}

	public Payment get(Long id) {
		return null;
	}

	
}
