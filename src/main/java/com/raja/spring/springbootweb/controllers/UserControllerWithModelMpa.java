package com.raja.spring.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.raja.spring.springbootweb.dto.User;


@Controller
public class UserControllerWithModelMpa {
	
	@RequestMapping("/mmregView")
	public String dispRegPage() {		 
		return "muserReg";
	}
	
	@RequestMapping(value="/mmRegisterUser",method=RequestMethod.POST)
	public String registeUser(@ModelAttribute("usr") User user,ModelMap modelMap) {
		System.out.println(user);
		modelMap.addAttribute("userInfo", user);
		return "mregResult";
	}

}
