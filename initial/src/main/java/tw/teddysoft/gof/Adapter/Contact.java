/*
 * Copyright 2016 TeddySoft Technology. All rights reserved.
 * 
 */
package tw.teddysoft.gof.Adapter;

public class Contact extends ConfigObject {
	private String email;
	
	public Contact() {
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}
