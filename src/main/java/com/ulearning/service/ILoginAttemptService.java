package com.ulearning.service;

public interface ILoginAttemptService {

	boolean isBlocked(String key);

	void loginFailed(String key);

	void loginSucceeded(String key);

}
