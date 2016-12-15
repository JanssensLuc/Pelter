package com.pelter.data.models;

import java.util.Date;

public class PersonDetails{
	private String firstName;
    private String lastName;
	private String alias;
	private Date birthdate;
	private String birthplace;
	private PersonInfo personInfo;

	public PersonDetails() {
		personInfo = new PersonInfo();
	}
	
	public PersonInfo getPersonInfo() {
		return this.personInfo;
	}
	
	public PersonDetails(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}

	public String getFirstname() {
		return this.firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return this.lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	
	/* TODO: Decorator */
    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
        // return Helper.prettyPrint();
    }
}
