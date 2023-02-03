package com.Practice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j) {
		//RequestParam helps in fetching values directly to variables
		
		//To send Data and Page use ModelAndView
//		int i = Integer.parseInt(request.getParameter("num1"));
//		int j = Integer.parseInt(request.getParameter("num2"));
		
			
		//Service Class to do processing can be used here for complex operations
		int k = i+j;
		
		ModelAndView view = new ModelAndView();
		view.setViewName("display");
		//If View Type is not necessarily JSP or can change use InternalResourceViewResolver to dynamically define type of view
		view.addObject("result",k);
		
		return view;
	}
	
}
