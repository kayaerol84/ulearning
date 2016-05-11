package com.ulearning.model;

import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;

@Entity
@Table(name="learning_session")
//@XmlRootElement(name="learning_session") //only needed if we also want to generate XML
public class LearningSession {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	// One session can have multipler learners (students)
	@ManyToMany
	@JoinTable(
		      name="session_learners",
		      joinColumns=@JoinColumn(name="session_id", referencedColumnName="id"),
		      inverseJoinColumns=@JoinColumn(name="learner_id", referencedColumnName="id"))
	private List<Learner> learnerList;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	private Date endDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="training_id")
	private Training training;
	// by hour
	@Basic
	private Float period;

	@Digits(integer=25, fraction=2)
	@Column(name = "actual_cost", precision = 25, scale = 2, nullable = false)
	private BigDecimal actualCost;
	
	@Digits(integer=25, fraction=2)
	@Column(name = "estimated_cost", precision = 25, scale = 2, nullable = true)
	private BigDecimal estimatedCost;
	

	public LearningSession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Learner> getLearnerList() {
		return learnerList;
	}
	public void setLearnerList(List<Learner> learnerList) {
		this.learnerList = learnerList;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Training getTraining() {
		return training;
	}
	public void setTraining(Training training) {
		this.training = training;
	}
	public Float getPeriod() {
		return period;
	}
	public void setPeriod(Float period) {
		this.period = period;
	}
	public BigDecimal getActualCost() {
		return actualCost;
	}
	public void setActualCost(BigDecimal actualCost) {
		this.actualCost = actualCost;
	}
	public BigDecimal getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(BigDecimal estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	
}
