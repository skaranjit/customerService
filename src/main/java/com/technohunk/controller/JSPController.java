package com.technohunk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPController {

	
	@GetMapping("/")
	public String loginPage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String register() {
		return "WEB-INF/register";   
	}
}
