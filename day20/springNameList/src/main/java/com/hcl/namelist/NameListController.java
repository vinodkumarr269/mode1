package com.hcl.namelist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class NameListController {
	@RequestMapping("/names")
	public ModelAndView nameDemo(){
		List<String> lstNames=new ArrayList<String>();
		lstNames.add("vinod");
		lstNames.add("kumar");
		lstNames.add("prem");
		lstNames.add("sai");
		lstNames.add("reddy");
		return new ModelAndView("ShowPage","lists",lstNames);
		
	}

}
