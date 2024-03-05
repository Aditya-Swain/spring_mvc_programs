package com.org.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.dto.Employee;

@Controller
public class EmpController {
		@GetMapping("load")
	public ModelAndView loadEmp() {
		
		Employee emp = new Employee(null, 0);
		
		ModelAndView mav = new ModelAndView("EmpForm.jsp");
		
		mav.addObject("employee", emp);
		return mav;
	}
		
		@PostMapping("/updateEmp")
		public ModelAndView registerEMp(@ModelAttribute Employee employee) {
			System.out.println(employee);
			ModelAndView mav = new ModelAndView("EmpForm.jsp");
			
			mav.addObject("success", "successfully updated");
			return mav;
			
			
		}
		
	@GetMapping("/fetch_emp")
	public ModelAndView fetchEmp() {
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("vishal" , 1000));
		emps.add(new Employee("karthik" , 3000));
		emps.add(new Employee("guddu" , 1000));
		
		
		ModelAndView mav = new ModelAndView("fetchEmp.jsp");
		mav.addObject("list", emps);
		return mav;
	}
		
		
		
		
		
		
		
		
		
		
		
}
