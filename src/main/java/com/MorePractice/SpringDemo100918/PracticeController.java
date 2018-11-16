package com.MorePractice.SpringDemo100918;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PracticeController {
	
	@Autowired
	PersonRepository p;

	
//	@RequestMapping("/")
//	public ModelAndView index() {
//		return new ModelAndView("index", "firstPage", "Welcome to the BeanBar!");
//	}
	
	
	@RequestMapping("/registration")
	public ModelAndView regPage() {
		return new ModelAndView("registration");
	}
	
//	@RequestMapping("/orderOnline")
//	public ModelAndView orderOnline() {
//		return new ModelAndView("orderOnline");
//	}
	
	@RequestMapping("/logIn")
	public ModelAndView logIn() {
		return new ModelAndView("logIn");
	}
	
	@RequestMapping("/map")
	public ModelAndView map() {
		return new ModelAndView("map");
	}
	
	@RequestMapping("/addperson")
	public ModelAndView addNewPerson(@RequestParam("fName") String fName, @RequestParam("lName") String lName, @RequestParam("email") String email, 
		@RequestParam("pw") String pw, @RequestParam("phone") String phone){
		Person p1 = new Person(fName, lName, email, pw, phone);
		System.out.println(p1);
		p.save(p1);
		String sayHello = "Hello, " + fName;
		return new ModelAndView("formPageCoffee", "userData", sayHello);
	}		


	
//	@RequestMapping("formresults")
//	public ModelAndView formTest(@RequestParam("fName") String fname, @RequestParam("lName") String lname) {
//		p.findByName(fname);
//		//String sayHello = "Hello, " + fname;
//		Person newPerson = new Person(fname,lname);
//		ModelAndView mv = new ModelAndView("formresults");
//		p.save(newPerson);
//		mv.addObject("BeanBarMembers", p.findAll());
//
//		return mv;
//	}
	
}
