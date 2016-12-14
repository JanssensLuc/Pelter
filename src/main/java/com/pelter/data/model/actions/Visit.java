/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pelter.data.model.actions;

import java.util.Date;

/**
 * Simple JavaBean domain object representing a visit.
 *
 * @author Ken Krebs
 */
//@Entity
//@Table(name = "visits")
public class Visit extends Activity {

    /**
     * Holds value of property date.
     */
    private Date visitDate;

//    /**
//     * Holds value of property description.
//     */
//    @NotEmpty
//    @Column(name = "description")
//
//
//    /**
//     * Holds value of property pet.
//     */
//    @ManyToOne
//    @JoinColumn(name = "pet_id")
//    private Pet pet;


    /**
     * Creates a new instance of Visit for the current date
     */
    public Visit() {
        this.visitDate = new Date();
    }


    /**
     * Getter for property date.
     *
     * @return Value of property date.
     */
    public Date getVisitDate() {
        return this.visitDate;
    }

    /**
     * Setter for property date.
     *
     * @param date New value of property date.
     */
    public void setVisitDate(Date date) {
        this.visitDate = date;
    }


//    /**
//     * Getter for property pet.
//     *
//     * @return Value of property pet.
//     */
//    public Pet getPet() {
//        return this.pet;
//    }
//
//    /**
//     * Setter for property pet.
//     *
//     * @param pet New value of property pet.
//     */
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

}
