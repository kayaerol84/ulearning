package com.ulearning.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="teacher_session_limit")
public class TeacherSessionLimit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@Enumerated(EnumType.STRING)
	private LimitType limitType;
	
	@Column	
	private Long sessionLimitCount;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insert_date")
	private Date insertDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	private Date updateDate;
	
	public TeacherSessionLimit() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LimitType getLimitType() {
		return limitType;
	}

	public void setLimitType(LimitType limitType) {
		this.limitType = limitType;
	}

	public Long getSessionLimitCount() {
		return sessionLimitCount;
	}

	public void setSessionLimitCount(Long sessionLimitCount) {
		this.sessionLimitCount = sessionLimitCount;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	

}
