package com.aastha;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aastha.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/addNumbers")
	public ModelAndView addNumbers(HttpServletRequest request, HttpServletResponse response) {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
        AddService as = new AddService();
        int sum = as.add(num1, num2);
        
        ModelAndView model = new ModelAndView("display");
        model.addObject("result", sum);
        
        return model;	
    }
}
