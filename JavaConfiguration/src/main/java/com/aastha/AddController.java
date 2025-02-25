package com.aastha;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {
	
	@RequestMapping("/addNumbers")
	public ModelAndView addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        
        int sum = num1 + num2;
        
        ModelAndView model = new ModelAndView("display");
        model.addObject("result", sum);
        
        return model;	
    }
}
