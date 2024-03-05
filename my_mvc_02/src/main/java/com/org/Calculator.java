package com.org;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {
		@GetMapping("/add")
	public ModelAndView add(@RequestParam int num1 , @RequestParam int num2 ) {
		
		ModelAndView mav =	new ModelAndView("output.jsp");
		mav.addObject("success",num1+num2);

		return mav;
	}
		@GetMapping("/sub")
		public ModelAndView sub(@RequestParam int num1 ,@RequestParam int num2 ) {
			
		
		ModelAndView mav =	new ModelAndView("output.jsp");
		mav.addObject("success",num1-num2);

			return mav;
		}
		
		@GetMapping("/mul")
		public ModelAndView mul(@RequestParam int num1, @RequestParam int num2) {
			
			
			ModelAndView mav =	new ModelAndView("output.jsp");
			mav.addObject("success",num1*num2);

			return mav;
		}
		
		@GetMapping("/div")
		public ModelAndView div( @RequestParam int num1 , @RequestParam int num2) {
		
			ModelAndView mav =	new ModelAndView("output.jsp");
			mav.addObject("success",num1/num2);
			return mav;
			
		}
		
		
		
		
		
		
		
		
		
}
