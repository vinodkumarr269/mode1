package com.hcl.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller     
public class HelloWorldController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		return new ModelAndView("result","message","welcome to mvc of spring");
	}
	@RequestMapping("/vinod")
	public ModelAndView helloVinod(){
		return new ModelAndView("result","message","welcome vinod to spring");
		
	}
}
