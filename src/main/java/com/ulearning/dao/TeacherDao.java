package com.ulearning.dao;

import com.ulearning.model.Teacher;

public interface TeacherDao {

	Teacher find(Long id);
	void update(Teacher teacher);
	void save(Teacher teacher);

}
