package com.ulearning.service.impl;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.ITeacherDao;
import com.ulearning.model.Teacher;
import com.ulearning.service.ITeacherService;

@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements ITeacherService{

	@Inject
	private ITeacherDao teacherDao;
	
	public void createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public void getTeacher(Long id) {
		// TODO Auto-generated method stub
		
	}

	public ITeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(ITeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	

}