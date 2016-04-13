package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IFollowerDao;
import com.ulearning.dao.IRequestDao;
import com.ulearning.model.Follower;
import com.ulearning.model.Learner;
import com.ulearning.model.Request;
import com.ulearning.model.Teacher;
import com.ulearning.model.Training;
import com.ulearning.model.User;
import com.ulearning.service.IFollowerService;
import com.ulearning.service.IRequestService;

@Service("followerService")
@Transactional
public class RequestServiceImpl implements IRequestService{

	@Autowired
	private IRequestDao requestDao;

	@Override
	public void requestTeacher(User user, Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestLearner(User user, Learner teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestTraining(User user, Training training) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptRequest(User acceptorUser, Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rejectRequest(User rejectorUser, Request response) {
		// TODO Auto-generated method stub
		
	}
	
		
	
}
