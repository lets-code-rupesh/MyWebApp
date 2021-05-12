package com.telusko.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String name;
	private String password;
	public Alien() {
		super();
	}
	public Alien(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
