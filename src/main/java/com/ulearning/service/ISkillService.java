package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Skill;
import com.ulearning.model.User;

public interface ISkillService {
	void addSkill(Skill skill);
	Skill findSkillByName(String name);
	List<Skill> findSkills(User user);
}
