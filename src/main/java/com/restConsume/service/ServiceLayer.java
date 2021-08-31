package com.restConsume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
	

	@Autowired
	private RestTemplate resttemplate;

	
	/*
	@Autowired
	public ServiceLayer(RestTemplate resttemplate) {
		this.resttemplate = resttemplate;
	}
	*/
	public String consumeAPI()
	{
	return resttemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", String.class);
	}
	
	

}
