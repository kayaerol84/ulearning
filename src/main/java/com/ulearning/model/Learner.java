package com.ulearning.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Learner")
public class Learner extends User{
	
	@Column(precision=3, scale=5) 
	private Float avarageScore; 
	
	@OneToMany
	private List<Training> subscribedTrainings;

	public Float getAvarageScore() {
		return avarageScore;
	}

	public void setAvarageScore(Float avarageScore) {
		this.avarageScore = avarageScore;
	}

	public List<Training> getSubscribedTrainings() {
		return subscribedTrainings;
	}

	public void setSubscribedTrainings(List<Training> subscribedTrainings) {
		this.subscribedTrainings = subscribedTrainings;
	}

}
