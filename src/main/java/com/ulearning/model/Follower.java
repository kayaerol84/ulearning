package com.ulearning.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table
//@XmlRootElement(name="Follower") //only needed if we also want to generate XML
public class Follower {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	
	@JoinColumn(name = "follower_user_id", referencedColumnName = "id")
	@ManyToOne
	private User follower;

	@JoinColumn(name = "followed_user_id", referencedColumnName = "id")
	@ManyToOne
	private User followed;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date startDate;
	
	public Follower() {
		// JPA only
	}
	
}
