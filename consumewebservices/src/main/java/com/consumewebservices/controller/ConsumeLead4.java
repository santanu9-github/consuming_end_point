package com.consumewebservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.consumewebservices.dto.Lead4;

@Controller
public class ConsumeLead4 {
@RequestMapping("/search")
public String getOneLead() {
	return"search_lead4";
}
@Autowired
private Lead4RestClient client;

@RequestMapping("/searchlead")
public String getLead4(@RequestParam("id")long id,ModelMap model) {
	Lead4 lead4 = client.oneLead4Info(id);
	model.addAttribute("lead4", lead4);
	return "lead_info";
}
}
