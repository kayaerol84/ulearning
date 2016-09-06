package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Address;
import com.ulearning.model.Skill;
import com.ulearning.model.Teacher;

public interface TeacherService {

	void addTeacher(Teacher teacher);
	Teacher getTeacher(Long id);
	void addSkillsToTeacher(Long teacherId, List<Skill> skills);
	List<Teacher> getTeachersByLocation(Address location);
	List<Teacher> getTeachersBySkill(Skill skill);
	List<Teacher> getTeachersByAddressAndSkill(Address location, Skill skill);
	
}
