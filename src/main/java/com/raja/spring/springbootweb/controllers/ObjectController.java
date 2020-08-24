package com.raja.spring.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raja.spring.springbootweb.dto.Employee;


@Controller
public class ObjectController {
	@RequestMapping("/readObj")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		modelAndView.addObject("emp", new Employee(1235, "RAJA SEKER", 400000.00));
		return modelAndView;
	}
}
