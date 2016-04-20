package com.ulearning.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ulearning.dao.IUserDao;
import com.ulearning.model.Training;
import com.ulearning.model.User;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {

	/*@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;*/
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	public UserDaoImpl() {
		
	}
	
	public UserDaoImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}

	/*protected EntityManager getEntityManager() {

		return entityManagerFactory.createEntityManager();
	}*/

	@Override
	public Long save(User user) {

		// after save, return generated ID
		getSession().save(user);
		return 1L;		
	}
	@Override
	public void saveOrUpdate(User entity) {
        getSession().saveOrUpdate(entity);
    }
	
	@Override
    public void update(User entity) {
        getSession().update(entity);
    }
/*
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
	} */

	public Training get(Long id) {
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean isValidUser(String username, String password) throws SQLException {
		
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("username", username));
		criteria.add(Restrictions.eq("password", password));
		//criteria.setProjection(Projections.projectionList().add(Projections.groupProperty("username")));
				
		List<User> users = criteria.list();
		
		if (users.size() == 1)
			return true;
		else
			return false;
	}

	public void test(String productName)
	{
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("product", productName));
		
		//criteria.add(Restrictions.eq("password", password));
		criteria.setProjection(Projections.projectionList().add(Projections.groupProperty("product")));
		criteria.setProjection(Projections.projectionList().add(Projections.sum("qty")));
				
		List<User> users = criteria.list();
		
	}
	/*public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}*/

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
	

}
