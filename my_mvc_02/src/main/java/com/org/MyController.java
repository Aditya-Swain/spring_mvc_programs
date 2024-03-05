package com.org;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@GetMapping("/link")	
	public String sendMessage() {
		System.out.println("link is ready");
		return "home.jsp";
	}
			
			@GetMapping("/dummy")
			public String dummy() {
				return "form.jsp";
			}
			
			
			@PostMapping("/user")
			public String userRegister(HttpServletRequest req , HttpSession session) {
				
				String name = req.getParameter("name");
				String age = req.getParameter("age");
				String email = req.getParameter("email");
				String password = req.getParameter("password");
				
				System.out.println(name);
				System.out.println(age);
				System.out.println(email);
				System.out.println(password);
				
				session.setAttribute("email", email);
				session.setAttribute("password", password);
				
				return "home.jsp";
			}
			
			@GetMapping("/login")
			public String loginDummy() {
				return "login.jsp";
			}
			
			
			@PostMapping("/userLogin")
			public String userLogin(HttpServletRequest req , HttpSession session) {
				
				String email = req.getParameter("email");
				String password = req.getParameter("password");
				
				String sessionEmail = (String) session.getAttribute("email");
				String sessionPassword = (String) session.getAttribute("password");
				
				if(email.equals(sessionEmail) && password.equals(sessionPassword))
					return "home.jsp";
				
				return "login.jsp";
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
