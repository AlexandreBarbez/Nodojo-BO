package com.nodojo.models;

public class Event {

	private long id;
	private String name;
	private String date;
	private String address;
	
	protected Event(){//JPA use	
	}
	public Event(long p_id,String p_name, String p_date, String p_address){
		this.id = p_id;
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
}
