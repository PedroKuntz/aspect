package com.aop.audit.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ManagedObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	public ManagedObject() {}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
