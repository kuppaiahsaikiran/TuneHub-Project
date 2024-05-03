package com.kodnest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	int pid;
	String pname;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
