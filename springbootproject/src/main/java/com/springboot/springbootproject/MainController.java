package com.springboot.springbootproject;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	public class MainController {
	
		@RequestMapping("/")
		public String home() {
			System.out.println("This is home");
		    return "home";
		    }
		@RequestMapping("/contact")
		public String contact() {
		System.out.println("This is a contact page");
		return "contact";
		
	
	}
}
