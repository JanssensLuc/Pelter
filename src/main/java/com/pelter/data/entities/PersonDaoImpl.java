package com.pelter.data.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.pelter.common.entities.BaseEntity;
import com.pelter.data.models.Person;
import com.pelter.data.models.PersonDetails;
/**
 * Simple JavaBean domain object representing an person.
 *
 * @author Luc Janssens
 */
@MappedSuperclass
public class PersonDaoImpl extends BaseEntity {
	PersonDetails personDetails;
	/* ------------ CONSTRUCTOR ------------- */
	public PersonDaoImpl(){
		personDetails = new PersonDetails();
	}
	
    @Column(name = "first_name")
    @NotEmpty
    protected String firstName;

    @Column(name = "last_name")
    @NotEmpty
    protected String lastName;

    public String getFirstName() {
        return personDetails.getFirstname();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}