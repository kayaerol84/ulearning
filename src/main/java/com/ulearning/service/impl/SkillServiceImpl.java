package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.SkillDao;
import com.ulearning.model.Skill;
import com.ulearning.model.User;
import com.ulearning.service.SkillService;

@Service("skillService")
@Transactional
public class SkillServiceImpl implements SkillService{

	@Autowired
	private SkillDao skillDao;

	@Override
	public void addSkill(Skill skill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Skill findSkillByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Skill> findSkills(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
