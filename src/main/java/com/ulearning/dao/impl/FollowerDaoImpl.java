package com.ulearning.dao.impl;

import java.util.ArrayList;
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

import com.ulearning.dao.FollowerDao;
import com.ulearning.model.Follower;
import com.ulearning.model.User;

@Repository("followerDao")
@Transactional
public class FollowerDaoImpl implements FollowerDao {

	@Autowired  
	SessionFactory sessionFactory;

	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}
	
	

	public Long save(Follower follower) {

		// after save, return generated ID
		Session currentSession = sessionFactory.getCurrentSession();  
	    currentSession.saveOrUpdate(follower);  

		return 0L;
	}

	public void update(Follower follower) {
		
		EntityManager entityManager = getEntityManager(); 

		try { 
            entityManager.getTransaction().begin(); 
 
            entityManager.merge(follower); 
 
            entityManager.getTransaction().commit(); 
        } catch (PersistenceException exc) { 
 
            entityManager.getTransaction().rollback(); 
 
            throw exc; 
        }
	}

	public Follower get(Long id) {
		return null;
	}



	@Override
	public Follower createFollower(Follower follower) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Follower followUser(User user, User teacherOrLearner) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<User> getFollowers(Long userId) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(userId);
		user.setName("Erol");
		
		List<User> users = new ArrayList<>();
		users.add(user);
		return users;
	}



	@Override
	public List<User> getFollowedUsers(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
