package edu.cpp.cs580.data;

import java.util.Date;


/**
 * The basic user object.
 */
public class User {

	/** The unique user Id */
    private String id;
    /** The unique user Id */
    private String name;
    /** The unique user Id */
    private String major;
    
    /** The user's starting address */
    private String starting_address;
    /** The user's end address */
    private String ending_address;
    
    /** The timestamp when the user is being created */
    private String creationTime = new Date(System.currentTimeMillis()).toString();
 
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
    public String starting_address() {
    	return starting_address;
    }
    
    public void set_starting_address(String starting_address) {
    	this.starting_address = starting_address;
    }

    public String ending_address() {
    	return ending_address;
    }
    
    public void set_ending_address(String ending_address) {
    	this.ending_address = ending_address;
    }

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
}
