package com.ulearning.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table
@XmlRootElement(name="Payment")
public class Payment {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Digits(integer=25, fraction=2)
	@Column(name = "ACTUAL_COST", precision = 25, scale = 2, nullable = false)
	private BigDecimal amount;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	private Date paymentDateTime;

}
