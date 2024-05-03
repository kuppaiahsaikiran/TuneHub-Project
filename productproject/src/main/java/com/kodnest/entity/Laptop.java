package com.kodnest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Laptop {

	@Id
	int lid;
	String lname;
	String lcolor;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLcolor() {
		return lcolor;
	}
	public void setLcolor(String lcolor) {
		this.lcolor = lcolor;
	}
	public Laptop() {
		super();

	}
	public Laptop(int lid, String lname, String lcolor) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lcolor = lcolor;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lcolor=" + lcolor + "]";
	}
	
	
	
	
}
