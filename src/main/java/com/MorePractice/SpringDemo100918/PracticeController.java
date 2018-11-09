package com.MorePractice.SpringDemo100918;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PracticeController {
	
	@Autowired
	private Person p;
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "firstPage", "Welcome to the Coffee Shop!");
	}
	
	
	@RequestMapping("/registration")
	public ModelAndView regPage() {
		return new ModelAndView("registration");
	}
	
	@RequestMapping("formresults")
	public ModelAndView formTest(@RequestParam("firstname") String fname, @RequestParam("lastname") String lname) {
		p.setFirstName(fname);
		p.setLastName(lname);
		String sayHello = "Hello, " + fname;
		return new ModelAndView("formPageCoffee", "userData", p);
	
}
}
