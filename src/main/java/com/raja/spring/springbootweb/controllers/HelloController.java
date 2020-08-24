package com.raja.spring.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String greatTheUser(@RequestParam("name") String name) {
		return "Hello "+name;
	}
	
	@RequestMapping("/hllo")
	public ModelAndView hello() {
		 
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "RAJA SELVARAJ");
		modelAndView.addObject("salary", "90000");
		return modelAndView;
	}

	
}
