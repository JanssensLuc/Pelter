package com.pelter.data.models;

import java.util.Set;

/** Simple javaBean representation of an address 
*/
public class Address {
	private String streetAddress;
	private String city;
	private String country;
	private Set<Person> residents;

	public Address() {
	}

	public Address(String streetAddress, String city, String country, Set<Person> residents){
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
		this.residents = residents;
//		resident.setAddress( this );
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}