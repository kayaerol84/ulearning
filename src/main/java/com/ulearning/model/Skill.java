package com.ulearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table
@XmlRootElement(name="Skill")
public class Skill {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Field field;
	/*
	 * One user can have multiple skills
	 * There must be a user_skills table
	 * User skills must have
	 * 	private Long endorsementCount;
	 */	
}
