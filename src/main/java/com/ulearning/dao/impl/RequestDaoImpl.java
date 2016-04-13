package com.ulearning.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ulearning.dao.IRequestDao;
import com.ulearning.model.Request;

@Repository("requestDao")
public class RequestDaoImpl implements IRequestDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}

	public Long save(Request request) {

		// after save, return generated ID
		return 0L;
	}

	public void update(Request request) {
		
		EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(request); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }
	}

	public Request get(Long id) {
		return null;
	}

	
}
