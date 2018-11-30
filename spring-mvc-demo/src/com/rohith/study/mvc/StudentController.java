package com.rohith.study.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countries}")
	private Map<String,String> countries;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//model.addAttribute("student", new Student());
		model.addAttribute("student", new Student());
	    model.addAttribute("countries", countries); 

		
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println(">> Student Details >> First Name >> "+student.getFirstName()+">> Last Name >>"+student.getLastName());
		
		return "student-confirmation";
	}

}
