package com.ulearning.model;

import java.util.Date;

import javax.persistence.Basic;
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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table
@XmlRootElement(name="Skill")
public class Skill {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Basic
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "field_id", referencedColumnName = "id")
	private Field field;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "insert_date")
	private Date insertDate;
}
