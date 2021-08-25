package com.olive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	@GetMapping("/info")
	public String show(Model model) {
		System.out.println(" calling method...........");
		model.addAttribute("ID" , 101 );
		model.addAttribute("Name","Ravi kumar singh");
		return "home";
	}

}
