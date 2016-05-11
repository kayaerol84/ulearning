package com.ulearning.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Teacher")
@PrimaryKeyJoinColumn(name="teacher_id", referencedColumnName="id")
//@XmlRootElement(name="Teacher")
public class Teacher extends User{
	
	// ENUM olmali
	@Basic
	private String occupation;
	//private List<Skill> skills; User already has it
	
	@Column(precision=3, scale=5) 
	private Float avarageScore;

	@OneToMany(mappedBy="user")
	private List<TeacherSessionLimit> limits;

	@Column
    @Convert(converter=BooleanToStringConverter.class)
	private Boolean active; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insert_date")
	private Date insertDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	private Date updateDate;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Float getAvarageScore() {
		return avarageScore;
	}

	public void setAvarageScore(Float avarageScore) {
		this.avarageScore = avarageScore;
	}

	public List<TeacherSessionLimit> getLimits() {
		return limits;
	}

	public void setLimits(List<TeacherSessionLimit> limits) {
		this.limits = limits;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}	

}
