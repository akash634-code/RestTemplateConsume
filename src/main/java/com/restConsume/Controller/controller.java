package com.restConsume.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restConsume.service.ServiceLayer;

@RestController
public class controller {
	


	@Autowired
	private  ServiceLayer servicelayer;
	
@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getdata() {

	return servicelayer.consumeAPI();
	}

	//public responsee
}
