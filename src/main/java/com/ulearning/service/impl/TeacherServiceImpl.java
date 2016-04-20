package com.ulearning.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.ITeacherDao;
import com.ulearning.model.Address;
import com.ulearning.model.Skill;
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

	@Override
	public Teacher getTeacher(Long id) {
		// TODO Auto-generated method stub
		teacherDao.find(id);
		return null;
	}

	public ITeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(ITeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSkillsToTeacher(Long teacherId, List<Skill> skills) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teacher> getTeachersByLocation(Address location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeachersBySkill(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeachersByAddressAndSkill(Address location, Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	

}