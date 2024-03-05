package com.org.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.dto.Person;

@Controller
public class PersonController {

//	@PostMapping("/register_person")
//		public ModelAndView registerPerson(@RequestParam String name,
//											@RequestParam int age,
//											@RequestParam long mobile,
//											@RequestParam String email,
//											@RequestParam String password) {
//			
//			
//			Person person = new Person();
//			
//			person.setName(name);
//			person.setAge(age);
//			person.setMobile(mobile);
//			person.setEmail(email);
//			person.setPassword(password);
//			
//			System.out.println(person);
//		ModelAndView mav =	 new ModelAndView("person_form.jsp");
//		mav.addObject("success", "Registration Successful");
//		return mav;
//		}
	
	@PostMapping("/register_person")
	public ModelAndView registerPerson(@ModelAttribute Person person) {
		
		System.out.println(person);
		
		ModelAndView mav = new ModelAndView("person_form.jsp");
		mav.addObject("success", "Registration Succussful");
		return mav;
		
	}
	

	@GetMapping("/fetch")
	public ModelAndView fetchPersons(HttpSession session) {
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("dinga",21,78787878));
		persons.add(new Person("dingi",23,70087878));
		persons.add(new Person("rakesh",11,787434878));
		persons.add(new Person("pramod",244,78783448));
		
		session.setAttribute("list", persons);
		return new ModelAndView("fetchPerson.jsp");
		
	}
}
