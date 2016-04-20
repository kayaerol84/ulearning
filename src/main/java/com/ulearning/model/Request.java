package com.ulearning.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Request {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat
	private Date requestDateTime;
	
	@ManyToOne
	private User requesterUser;
	
	@ManyToOne
	private Training requestedTraining;
	// What user requested
	// Whom user requested
	
}
