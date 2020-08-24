package com.raja.spring.springbootweb.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raja.spring.springbootweb.dto.Employee;


@Controller
public class ListController {
	@RequestMapping("/readLst")
	public ModelAndView sendLst() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add( new Employee(235, "RAJA SEKER", 400000.00));
		employees.add( new Employee(456, "ARUN RAJ", 500000.00));
		employees.add( new Employee(568, "ASHOk", 300000.00));
		modelAndView.addObject("empLst", employees);
		return modelAndView;
	}
}
