package com.nodojo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Events {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String date;
	private String address;
	
	//Needed for JPA
	protected Events(){}
	
	public Events(String p_name, String p_date, String p_address){
		this.name = p_name;
		this.date = p_date;
		this.address = p_address;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public String getAddress() {
		return address;
	}	
	@Override
	public String toString() {
		return String.format(
                "Event[id=%d, name='%s', date='%s', address='%s']",
                id, name, date, address);
	}
}
