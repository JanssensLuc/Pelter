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

import java.security.acl.Owner;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Simple business object representing a building.
 *
 * @author Luc Janssens
 */
@Entity
@Table(name = "items")
public interface BuildingEntity{
 //   @ManyToOne
  //  @JoinColumn(name = "type_id")
//    private PetType type;
    
    void setBuildYear(int buildYear);
    
    @Column(name = "build_year")
    int getBuildYear();
    
    @ManyToOne
    @JoinColumn(name = "owner_id")
    Set<Owner> getOwners();
    
    void addOwners(Owner owner);
}
