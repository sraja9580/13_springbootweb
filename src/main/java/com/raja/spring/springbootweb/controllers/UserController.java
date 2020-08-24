package com.raja.spring.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.raja.spring.springbootweb.dto.User;


@Controller
public class UserController {
	
	@RequestMapping("/regView")
	public ModelAndView dispRegPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public ModelAndView registeUser(@ModelAttribute("usr") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("regResult");
		modelAndView.addObject("userInfo", user);
		return modelAndView;
	}

}
