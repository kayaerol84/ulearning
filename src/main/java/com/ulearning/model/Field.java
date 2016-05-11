package com.ulearning.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Field") 
//@XmlRootElement(name="Field") //only needed if we also want to generate XML
public class Field {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private String name;
	
	// TODO 
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="parent_field_id", updatable=false)
	private List<Field> subFields;
	
	@ManyToOne 
	@JoinColumn(name="parent_field_id", referencedColumnName = "id")
	private Field parentField;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "insert_date")
	private Date insertDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "last_update_date")
	private Date updateDate;
	
	public Field() {
		// JPA only
	}
	
	public boolean isParent(){
		return parentField == null;
	}	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Field> getSubFields() {
		return subFields;
	}

	public void setSubFields(List<Field> subFields) {
		this.subFields = subFields;
	}

	public Field getParentField() {
		return parentField;
	}

	public void setParentField(Field parentField) {
		this.parentField = parentField;
	}

	
}
