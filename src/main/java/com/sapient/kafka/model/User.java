package com.sapient.kafka.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public User() {
		
	}
	
	public User(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
