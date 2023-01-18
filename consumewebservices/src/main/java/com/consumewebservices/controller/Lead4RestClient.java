package com.consumewebservices.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.consumewebservices.dto.Lead4;

@Component
public class Lead4RestClient {

	public Lead4 oneLead4Info(long id) {
	RestTemplate rest=new RestTemplate();
	Lead4 lead4 = rest.getForObject("http://localhost:8080/leads4/api/get/"+id,Lead4.class);
	return lead4;
	}

}
