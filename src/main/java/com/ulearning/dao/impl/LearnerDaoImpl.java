package com.ulearning.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ulearning.dao.ILearnerDao;
import com.ulearning.model.Address;
import com.ulearning.model.Learner;

@Repository("learnerDao")
public class LearnerDaoImpl implements ILearnerDao {

	/*@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}*/
	@Autowired
	SessionFactory sessionFactory; 

	public void save(Learner learner) {

		// after save, return generated ID
		//return 0L;
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

	@Override
	public List<Learner> getLearnersByLocation(Address location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Learner> getLearnersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
