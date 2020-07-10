package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.mvc.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("input1") int a, @RequestParam("input2") int b) {
		
		//Service layer separation
		AddService as = new AddService();
		int c = as.add(a, b);
		
		ModelAndView mv = new ModelAndView();
		/*
		 * Notice we did not mention the .jsp suffix here
		 * With help of com.example.MainServletConfig.viewResolver() method
		 * we will be able to switch to a different 
		 */
		mv.setViewName("display");
		mv.addObject("result", c);
		return mv;
	}
}
