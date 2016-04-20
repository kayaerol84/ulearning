package com.ulearning.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ulearning.dao.ITeacherDao;
import com.ulearning.model.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl implements ITeacherDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Autowired
	SessionFactory sessionFactory;
	
	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}

	public void save(Teacher teacher) {

		// after save, return generated ID
		//return 0L;
	}

	public void update(Teacher teacher) {
		
		EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(teacher); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }
	}

	public Teacher find(Long id) {
		return null;
	}

	
}
