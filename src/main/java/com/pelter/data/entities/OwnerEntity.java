package com.pelter.data.entities;

public interface OwnerEntity {
	package com.pelter.data.entities;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;

	import org.springframework.beans.support.MutableSortDefinition;
	import org.springframework.beans.support.PropertyComparator;
	import org.springframework.core.style.ToStringCreator;

	import com.pelter.common.entities.BaseEntity;

	@Entity
	@Table(name = "owners")
	public class OwnerEntityImpl extends PersonDaoImpl {
	    @Column(name = "address")
//	    @NotEmpty
	    public String getAddress();

	    public void setAddress(String address);

	    @Column(name = "city")
//	    @NotEmpty
	    public String getCity();

	    public void setCity(String city);
	    
	    @Column(name = "telephone")
		 //   @NotEmpty
		 //   @Digits(fraction = 0, integer = 10)
	    public String getTelephone();

	    public void setTelephone(String telephone);
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	    public List<Pet> getPets();
	    public void addPet(Pet pet);

	    /**
	     * Return the Pet with the given name, or null if none found for this Owner.
	     *
	     * @param name to test
	     * @return true if pet name is already in use
	     */
	    public Pet getPet(String name);
	    /**
	     * Return the Pet with the given name, or null if none found for this Owner.
	     *
	     * @param name to test
	     * @return true if pet name is already in use
	     */
	    public Pet getPet(String name, boolean ignoreNew) ;

	    @Override
	    public String toString();
}
