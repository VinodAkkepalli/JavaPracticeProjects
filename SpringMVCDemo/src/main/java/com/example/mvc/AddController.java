package com.example.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.mvc.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int a = Integer.parseInt(request.getParameter("input1"));
		int b = Integer.parseInt(request.getParameter("input2"));
		
		//Service layer separation
		AddService as = new AddService();
		int c = as.add(a, b);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", c);
		return mv;
	}
}
