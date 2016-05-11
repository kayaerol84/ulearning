package com.ulearning.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;

@Entity
@Table
public class Payment { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;	
	
	@Digits(integer=25, fraction=2)
	@Column(name = "payment_amount", precision = 25, scale = 2, nullable = false)
	private BigDecimal amount;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "payment_date")
	private Date paymentDateTime;
	
	@OneToOne
	@JoinColumn(name = "session_id")
	private LearningSession learningSession;

	
	public Payment() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getPaymentDateTime() {
		return paymentDateTime;
	}

	public void setPaymentDateTime(Date paymentDateTime) {
		this.paymentDateTime = paymentDateTime;
	}

	public LearningSession getLearningSession() {
		return learningSession;
	}

	public void setLearningSession(LearningSession learningSession) {
		this.learningSession = learningSession;
	}
	
}
