package com.flexon.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class JavaAccountControllerJPA {

	@Autowired
	private JavaAccountRepository userRepo;
	
	//Get all Users from the Arraylist
	@GetMapping(path="/jpa/getAllUsers")
	public List getAllUsers(){
		return (List) userRepo.findAll();		
	}

	
}
