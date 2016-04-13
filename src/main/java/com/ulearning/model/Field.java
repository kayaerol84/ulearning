package com.ulearning.model;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

//import org.hibernate.annotations.Index;
//import org.hibernate.annotations.Table;

@Entity
@Table(name="Field") 
@XmlRootElement(name="Field")
//@Table(indexes={@Index (name="pmx_id", columnNames="id")}, appliesTo = "Field")
public class Field {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Basic
	private String name;
	
	// TODO 
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="parentFieldId", updatable=false)
	private List<Field> subFields;
	
	@Column(name="parentFieldId")
	private Field parentField;
	
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
