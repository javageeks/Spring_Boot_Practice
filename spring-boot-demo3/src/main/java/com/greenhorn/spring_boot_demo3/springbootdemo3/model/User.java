/**
 * 
 */
package com.greenhorn.spring_boot_demo3.springbootdemo3.model;

import java.io.Serializable;

/**
 * @author Hussain
 *
 */
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6730768993032549036L;
	
	private int usierId;
	private String firstName;
	private String lastName;
	public User() {
	
	}
	public int getUsierId() {
		return usierId;
	}
	public void setUsierId(int usierId) {
		this.usierId = usierId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
