package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.LoginBean;
import com.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("/login")
	public String showLoginpage( @ModelAttribute("login") LoginBean loginBean, BindingResult result ) 
	{
		return "login";

	}

	@RequestMapping(value = "/submitlogin",method = RequestMethod.POST)
	public String checkLoginDetails( @ModelAttribute("login") LoginBean loginBean,BindingResult result) {
		
		if(service.validate(loginBean))
		{
			return "success";
		}
		else
		{
			return "invalid";
		}
		
	
		

	}
	

}
