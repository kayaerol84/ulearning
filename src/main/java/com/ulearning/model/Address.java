package com.ulearning.model;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	@JoinColumn(name = "user_id", referencedColumnName = "id") 
	@ManyToOne 
	private User userId;
	
	@Enumerated(EnumType.STRING)
	private AddressType addressType;	
	
	private String street;
	private String houseNumber;
	private String postCode;
	private String city;
	private String state;
	private String country;

	private Date insertDate;
	private Date updateDate;
}
