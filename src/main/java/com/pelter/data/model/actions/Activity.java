package com.pelter.data.model.actions;

import java.util.Date;

public abstract class Activity {
    private Date lastModifiedDate;
    private Date createdDate;
	private String description;

	
	public Activity(){
		this.createdDate = new Date();
	}
    /**
     * Getter for property description.
     *
     * @return Value of property description.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for property description.
     *
     * @param description New value of property description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Getter for property date.
     *
     * @return Value of property date.
     */
    public Date getLastMdoifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * Setter for property date.
     *
     * @param date New value of property date.
     */
    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }  
    
    /**
     * Getter for property date.
    *
    * @return Value of property date.
    */
    public Date getCreateDate() {
        return this.createdDate;
    }
}