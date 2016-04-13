package com.ulearning.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "User")
@Inheritance(strategy = InheritanceType.JOINED)
@XmlRootElement(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Basic
	private String name;
	@Basic
	private String surname;
	@Basic
	private Date dateOfBirth;

	// ara tablo
	@ManyToMany
	@JoinTable(name = "user_skills", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "skill_id", referencedColumnName = "id") })
	private List<Skill> skills;

	// TODO how to endorse a user
	@Basic
	private Float averageScore;

	@OneToMany(mappedBy = "customerId")	
	/*@JoinTable(name = "user_addresses", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "address_id", referencedColumnName = "id") }) */
	private List<Address> addresses;

	private Address location;

}
