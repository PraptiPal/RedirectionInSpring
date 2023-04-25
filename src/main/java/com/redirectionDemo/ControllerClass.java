package com.redirectionDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {

	@RequestMapping(value = "/")
	public String home() {
		return "Home";
	}
//	
	@RequestMapping("/inputForm")
	public String input(){
		return "inputForm";
	}
	
//	@ModelAndView
	
	@RequestMapping("/outputForm")
	public String output1(){
		return "outputForm";
	}
//	
	@RequestMapping(value = "/redirect")
	public String redirect(){
		return "redirect:/inputForm";
	}
}