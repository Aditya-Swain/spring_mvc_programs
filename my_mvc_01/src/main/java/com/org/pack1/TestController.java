package com.org.pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
		@RequestMapping("/hii")
	public String m1() {
		
		System.out.println("Welcome to Spring MVC");
		
		return "success.jsp";
	}
		@RequestMapping("/hello")
		public String m2() {
			System.out.println("m2() method executed");
			
			return "success.jsp";
		}
}
