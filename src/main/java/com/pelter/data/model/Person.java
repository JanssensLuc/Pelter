package com.pelter.data.models;

import java.util.Date;

public class Person {
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public Date getBirtdate() {
		return birtdate;
	}
	public void setBirtdate(Date birtdate) {
		this.birtdate = birtdate;
	}
	
	private String firstname;
	private String lastname;
	private String birthplace;
	private Date birtdate;
}
