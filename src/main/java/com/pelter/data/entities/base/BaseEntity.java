package com.pelter.data.entities.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private boolean enabled;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/** Enable / disable the soecific data */
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.id == null || obj == null || !this.getClass().equals(obj.getClass()))
			return false;
		return this.id.equals(((BaseEntity)obj).getId());
	}
	
	@Override
	public int hashCode(){
		return id == null ? 0 : id.hashCode();
	} 
	
    public boolean isNew() {
        return this.id == null;
    }
	
}
