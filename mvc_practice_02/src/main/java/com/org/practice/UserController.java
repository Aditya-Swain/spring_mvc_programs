package com.org.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
		@GetMapping("/load")
	public ModelAndView loadUser() {
		
		User user = new User();
		
		user.setName("kakashi");
		user.setAge(33);
		user.setMobile(43243243243l);
		user.setEmail("kakashi@gmail.com");
		user.setPassword("1111");
		
		ModelAndView mav = new ModelAndView("update_user.jsp");
		mav.addObject("user", user);
		
		return mav;
	}
		
		@PostMapping("/updateUser")
		public ModelAndView updateUser(@ModelAttribute User user) {
			
			System.out.println(user);
			
			ModelAndView mav = new ModelAndView("user_index.jsp");
			mav.addObject("success","successfully updated");
			
			return mav;
			
		}
}
