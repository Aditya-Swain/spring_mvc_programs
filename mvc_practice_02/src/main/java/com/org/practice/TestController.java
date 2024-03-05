package com.org.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
		@RequestMapping("/earth")
	public String m1() {
		System.out.println("earth executed");
		
		return "earth.jsp";
	}
		
		@RequestMapping("/mars")
		public String m2() {
			System.out.println("mars exucuted");
			
			return "earth.jsp";
		}
	
}
