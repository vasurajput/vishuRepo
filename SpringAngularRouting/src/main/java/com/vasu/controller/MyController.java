package com.vasu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signUpEndPoint")
	public String signUp() {
		return "signup";
	}
	
	@GetMapping("/homeEndPoint")
	public String home() {
		return "home";
	}
	
	@GetMapping("/defaultEndPoint")
	public String defaultRoute() {
		return "default";
	}
	
	@GetMapping("/contactUsEndPoint")
	public String contact() {
		return "contact";
	}
}
