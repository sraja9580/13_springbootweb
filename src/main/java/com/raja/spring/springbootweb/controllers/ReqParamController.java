package com.raja.spring.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReqParamController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String cname,
			@RequestParam(value="sal",required=false,defaultValue="456") String salary) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("ID: " + id);
		System.out.println("name: " + cname);
		System.out.println("Salary: " + salary);
		modelAndView.setViewName("userReg");
		return modelAndView;
	}

}
