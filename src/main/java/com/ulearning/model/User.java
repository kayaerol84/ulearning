package com.ulearning.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
		
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private String username;
	
	@Basic
	private String name;
	
	@Basic
	private String surname;
	
	@Basic
	private String email;
	
	// TODO
	@JsonIgnore
	private String password;

	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Date birthDate;

	@ManyToMany
	@JoinTable(name = "user_skills", 
	joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") }, 
	inverseJoinColumns = { @JoinColumn(name = "skill_id", referencedColumnName = "id") })
	private List<Skill> skills;

	// TODO how to endorse a user
	// trigger on Ranking table
	/*@Column(precision=3, scale=5) 
	private Float averageScore;*/

	@OneToMany(mappedBy = "userId")	
	private List<Address> addresses;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="primary_address_id")
	private Address primaryLocation;
	
	@Temporal(TemporalType.DATE)
	@Column(name="creation_date")
	private Date creationDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="last_update_date")
	private Date lastUpdateDate;

	@Column
	@Convert(converter=BooleanToStringConverter.class)
	private boolean enabled;

    @ManyToMany
    @JoinTable(name = "users_roles", 
      joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id") , 
      inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id") )
    private Collection<Role> roles;
	
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	/*public Float getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(Float averageScore) {
		this.averageScore = averageScore;
	}*/

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getPrimaryLocation() {
		return primaryLocation;
	}

	public void setPrimaryLocation(Address primaryLocation) {
		this.primaryLocation = primaryLocation;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}	
	
}