package com.ulearning.model;

import java.util.List;

public interface ILearnerList {
	public List<Teacher> getTeacherList(Long userId);
	public List<Learner> getLearnerList(Long userId);
	public List<Field> getFieldList(Long userId);

}
