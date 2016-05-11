package com.ulearning.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Request {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	 
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "request_datetime")
	private Date requestDateTime;
	
	@ManyToOne
	@JoinColumn(name = "requester_user_id", referencedColumnName = "id")	
	private User requesterUser;
	
	
	@ManyToOne
	@JoinColumn(name = "request_training_id", referencedColumnName = "id") 
	private Training requestedTraining;


	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getRequestDateTime() {
		return requestDateTime;
	}


	public void setRequestDateTime(Date requestDateTime) {
		this.requestDateTime = requestDateTime;
	}


	public User getRequesterUser() {
		return requesterUser;
	}


	public void setRequesterUser(User requesterUser) {
		this.requesterUser = requesterUser;
	}


	public Training getRequestedTraining() {
		return requestedTraining;
	}


	public void setRequestedTraining(Training requestedTraining) {
		this.requestedTraining = requestedTraining;
	}
	
	
}
