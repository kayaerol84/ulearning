package com.ulearning.service;

public interface LoginAttemptService {

	boolean isBlocked(String key);

	void loginFailed(String key);

	void loginSucceeded(String key);

}
