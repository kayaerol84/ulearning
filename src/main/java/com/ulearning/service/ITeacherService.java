package com.ulearning.service;

import com.ulearning.model.Teacher;

public interface ITeacherService {

	void createTeacher(Teacher teacher);
	void getTeacher(Long id);
}
