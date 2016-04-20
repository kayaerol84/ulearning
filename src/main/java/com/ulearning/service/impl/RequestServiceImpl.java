package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IRequestDao;
import com.ulearning.model.Request;
import com.ulearning.model.Teacher;
import com.ulearning.model.Training;
import com.ulearning.model.User;
import com.ulearning.service.IRequestService;

@Service("requestService")
@Transactional
public class RequestServiceImpl implements IRequestService{

	@Autowired
	private IRequestDao requestDao;

	@Override
	public void requestTeacher(User user, Teacher teacher) {
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

	@Override
	public Request getRequest(Long requestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> getRequestsByUser(Long userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> getRequestsByTraining(Long trainingId) {
		// TODO Auto-generated method stub
		return null;
	}

	public IRequestDao getRequestDao() {
		return requestDao;
	}

	public void setRequestDao(IRequestDao requestDao) {
		this.requestDao = requestDao;
	}
	

}
