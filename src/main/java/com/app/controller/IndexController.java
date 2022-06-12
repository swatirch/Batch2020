package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


	@GetMapping({ "/", "/home" })
	public String Index() {
		System.out.println("Index Controller");
		/*
		 * model.addAttribute("users", model);
		 */
		return "index";
	}
	
	

}
