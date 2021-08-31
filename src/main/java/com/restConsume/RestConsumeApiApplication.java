package com.restConsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestConsumeApiApplication {

	@Bean
	public RestTemplate resttemplate(){
	return  new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(RestConsumeApiApplication.class, args);
	}

}
