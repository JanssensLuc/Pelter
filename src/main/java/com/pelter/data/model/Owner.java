/*
 */
package com.pelter.data.models;

/**
 * Simple JavaBean domain object representing an owner.
 *
 * @author Janssens Luc
 */
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
