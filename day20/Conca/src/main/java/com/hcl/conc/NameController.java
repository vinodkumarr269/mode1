package com.hcl.conc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {
	@RequestMapping("/conc")
	public ModelAndView calc(HttpServletRequest req,HttpServletResponse res){
   String a,b,c;
   a=req.getParameter("firstName");
   b=req.getParameter("secondName");
   c=a+b;
  String result="";
  result+=c;
  return new ModelAndView("result","result",result);
	}
}
