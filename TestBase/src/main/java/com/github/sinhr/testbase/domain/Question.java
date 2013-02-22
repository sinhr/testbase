package com.github.sinhr.testbase.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table(name = "QUESTIONS")
	public class Question {

	    @Id
	    @Column(name = "ID")
	    @GeneratedValue
	    private Integer id;

	    @Column(name = "FIRSTNAME")
	    private String firstname;

	    @Column(name = "LASTNAME")
	    private String lastname;

	    @Column(name = "EMAIL")
	    private String email;

	    @Column(name = "TELEPHONE")
	    private String telephone;

	    // Getters and setters
}

