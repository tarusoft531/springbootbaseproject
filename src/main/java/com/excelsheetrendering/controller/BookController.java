package com.excelsheetrendering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	@RequestMapping("/homepage")
	public String getHomePage() {
		return "home";
	}
	
	@RequestMapping("/home")
	public ModelAndView getExcelData() {
		ModelAndView model = new ModelAndView("exceldata");
		return model;
	}
}
