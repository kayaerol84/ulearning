package com.ulearning.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Teacher")
@PrimaryKeyJoinColumn(name="teacher_id", referencedColumnName="id")
@XmlRootElement(name="Teacher")
public class Teacher extends User{
	
	// private Long userId
	/*private String name;
	private String surname;
	private Date dateOfBirth;*/
	// ENUM olmali
	@Basic
	private String occupation;
	//private List<Skill> skills; User already has it
	
	@Column(precision=3, scale=5) 
	private Float avarageScore;
	
	@OneToMany(mappedBy="user")
	private List<TeacherSessionLimit> limits;

}
