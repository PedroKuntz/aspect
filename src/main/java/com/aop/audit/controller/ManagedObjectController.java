package com.aop.audit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aop.audit.model.ManagedObject;

@RestController
public class ManagedObjectController {

	@Autowired
	ManagedObject mo;
	
	@GetMapping("/mo")
	public @ResponseBody String getManagedObject() {
		mo.setId(1L);
		mo.setName("Testing Audit");
		return mo.getName();
	}
	
}
