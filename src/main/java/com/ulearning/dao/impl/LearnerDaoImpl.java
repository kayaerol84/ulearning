package com.ulearning.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ulearning.dao.ILearnerDao;
import com.ulearning.model.Learner;
import com.ulearning.model.Training;

@Repository("learnerDao")
public class LearnerDaoImpl implements ILearnerDao {

	/*@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}*/
	@Autowired
	SessionFactory sessionFactory; 

	public Long save(Learner learner) {

		// after save, return generated ID
		return 0L;
	}

	public void update(Learner learner) {
		
		/*EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(training); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }**/
	}

	public Learner get(Long id) {
		return null;
	}

	
}
