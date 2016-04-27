package com.ulearning.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ulearning.dao.IFollowerDao;
import com.ulearning.dao.ISkillDao;
import com.ulearning.model.Skill;
import com.ulearning.model.Training;

@Repository("skillDao")
public class SkillDaoImpl implements ISkillDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Autowired
	SessionFactory sessionFactory;
	
	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}

	public Long save(Skill skill) {

		// after save, return generated ID
		return 0L;
	}

	public void update(Skill skill) {
		
		EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(skill); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }
	}

	public Skill get(Long id) {
		return null;
	}

	
}
