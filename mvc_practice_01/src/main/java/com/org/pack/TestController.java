package com.org.pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
			@RequestMapping("/link")
	public String m1() {
		System.out.println("Wake Up To Reality !");
		
		return "world.jsp";
	}
			@RequestMapping("/link1")
			public String m2() {
				System.out.println("Madara Uchiha !");
				
				return "world.jsp";
			}
}
