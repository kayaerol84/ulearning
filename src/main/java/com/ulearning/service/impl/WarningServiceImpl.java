package com.ulearning.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.service.IWarningService;

@Service("warningService")
@Transactional
public class WarningServiceImpl implements IWarningService{

	@Override
	public void warnTeacher(Long teacherId, String message, String reason) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warnLearner(Long learnerId, String message, String reason) {
		// TODO Auto-generated method stub
		
	}

	
		

}
