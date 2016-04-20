package com.ulearning.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Training")
@XmlRootElement(name="Training") //only needed if we also want to generate XML
public class Training {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
	
	@OneToMany(mappedBy="training")	
	private List<LearningSession> learningSessons;
	
	@Column(precision=25,scale=2)
	private BigDecimal requestedPrice;
	
	@Basic
	private Long duration;
	
	@Basic
	private Boolean available;
	
	// TODO
	@ManyToMany
	@JoinTable(
		      name="training_subscribers",
		      joinColumns=@JoinColumn(name="training_id", referencedColumnName="id"),
		      inverseJoinColumns=@JoinColumn(name="learner_id", referencedColumnName="id"))
	private List<Learner> subscribers;
	
	@ManyToOne
	@JoinColumn(name = "field_id", referencedColumnName = "id")
	private Field fieldOfTraining;
	/*
	 * bu egitim icin istenen ucret
	 * suresi
	 * availability > teacher bunu enable disable edebilir. 
	 * bu egitime subscribe olan kisi sayisi > teacher bu degere bakarak available=false diyebilir
	 * bu egitimin field i 
	 */
	public Training(Long id, Teacher teacher, Field fieldOfTraining) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.fieldOfTraining = fieldOfTraining;
	}
	public Training() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<LearningSession> getLearningSessons() {
		return learningSessons;
	}
	public void setLearningSessons(List<LearningSession> learningSessons) {
		this.learningSessons = learningSessons;
	}
	
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public List<Learner> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(List<Learner> subscribers) {
		this.subscribers = subscribers;
	}
	public Field getFieldOfTraining() {
		return fieldOfTraining;
	}
	public void setFieldOfTraining(Field fieldOfTraining) {
		this.fieldOfTraining = fieldOfTraining;
	}
	
	public int getCountOfSubscribers(){
		return getSubscribers().size();
	}

	public BigDecimal getRequestedPrice() {
		return requestedPrice;
	}

	public void setRequestedPrice(BigDecimal requestedPrice) {
		this.requestedPrice = requestedPrice;
	}
	
	
}
