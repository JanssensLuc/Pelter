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
package com.pelter.data.entities;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.format.annotation.DateTimeFormat;

import com.pelter.common.entities.NamedEntity;
import com.pelter.data.models.Owner;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Simple business object representing a building.
 *
 * @author Luc Janssens
 */
@Entity
@Table(name = "items")
public abstract class BuildingEntityImpl extends NamedEntity {

    @Column(name = "build_year")
    private int buildYear;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Set<Owner> owners;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet", fetch = FetchType.EAGER)
//    private Set<Visit> visits;


    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getBuildYear() {
        return this.buildYear;
    }
    
    public Set<Owner> getOwners() {
        return this.owners;
    }
    
    public void addOwners(Owner owner) {
        getOwnerInternal().add(owner);
//        owner.setPet(this);
    }
    protected void setOwners(Set<Owner> owner) {
        this.owners = owner;
    }

    protected Set<Owner> getOwnerInternal() {
        if (this.owners == null) {
            this.owners = new HashSet<Owner>();
        }
        return this.owners;
    }


}
