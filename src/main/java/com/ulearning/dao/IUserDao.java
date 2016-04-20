package com.ulearning.dao;

import java.sql.SQLException;

import com.ulearning.model.User;

public interface IUserDao {

	Long save(User user);

	void saveOrUpdate(User entity);

	void update(User entity);

	boolean isValidUser(String username, String password) throws SQLException;

}
