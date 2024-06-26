package com.api.Entity;

import org.hibernate.internal.build.AllowSysOut;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	
    @Column(nullable = false)
	private String name;
    @Column(nullable = false)
	private String city;
	
	

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
	
}
