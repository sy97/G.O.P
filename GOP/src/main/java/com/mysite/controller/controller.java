package com.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	
	@GetMapping("/adaption")
	public String Adaption() {
		return "adaption";
	}
	
	@GetMapping("/volunteer")
	public String Volunteer() {
		return "volunteer";
	}

}
