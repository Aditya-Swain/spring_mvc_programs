package com.org.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.UserDao;
import com.org.dto.User;

@Controller
public class UserController {
			@PostMapping("/register_user")
	public ModelAndView userRegister(@ModelAttribute User user) {
		
				UserDao dao  = new UserDao();
				dao.saveAndUpdate(user);
				
				ModelAndView mav = new ModelAndView("user_form.jsp");
				mav.addObject("success" ,"Registered Succussfully");
				
				return mav;
	}
			@PostMapping("/login_user")
			public ModelAndView loginUser(@RequestParam String email, @RequestParam String password) {
				
				
				UserDao dao = new UserDao();
				
				List<User> user = dao.fetchByEmailPassword(email, password);
				
				if(!user.isEmpty()) {
					ModelAndView mav = new ModelAndView("home.jsp");
					return mav;
				}
				
				ModelAndView mav = new ModelAndView("user_login.jsp");
				mav.addObject("fail", "Invalid Email or Password");
				return mav;
				
			}
			@GetMapping("/dummy")
			public String dummyLogin() {
				return "user_login.jsp";
			}
			
			@GetMapping("/dummy1")
			public String dummyRegister() {
				return "user_form.jsp";
			}
}
