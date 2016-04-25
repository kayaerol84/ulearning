package com.ulearning.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Learner")
@PrimaryKeyJoinColumn(name="learner_id", referencedColumnName="id")
@XmlRootElement(name="Learner") //only needed if we also want to generate XML
public class Learner extends User{
	
	@Column(precision=3, scale=5) 
	private Float avarageScore;
	@Column(name="CityBorn", columnDefinition="default 'SANDNESS'")
    private String cityBorn;
	
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
