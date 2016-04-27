package com.ulearning.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

 /*   @ManyToMany
    @JoinTable(name = "roles_privileges", 
    	joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"), 
    	inverseJoinColumns = @JoinColumn(name = "privilege_id", referencedColumnName = "id") )
    private Collection<Privilege> privileges;*/

    @Basic
    private String name;

    public Role() {
        super();
    }

    public Role(final String name) {
        super();
        this.name = name;
    }
    
}