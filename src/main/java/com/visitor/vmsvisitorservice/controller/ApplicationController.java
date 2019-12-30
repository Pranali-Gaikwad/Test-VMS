package com.visitor.vmsvisitorservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ApplicationController {

	
	@GetMapping("/home")
	public ModelAndView welcome()
	{
		return new ModelAndView("welcome");
	}
	
	
	
	 @GetMapping("/loadVisitor")
		public ModelAndView loadVisitor()
	 {
			return new ModelAndView("VisitorRegistration");
		}
}
