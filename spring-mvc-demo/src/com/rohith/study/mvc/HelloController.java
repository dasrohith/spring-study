package com.rohith.study.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello/")
public class HelloController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-kid";
	}
	
	@RequestMapping("/processFormV2")
	public String shoutAtMe(HttpServletRequest  request, Model model) {
		
		String studentName = request.getParameter("studentName");
		System.out.println("HomeController.shoutAtMe()"+studentName);
		
		String shoutString = "Ro welcomes you "+ studentName.toUpperCase();
		
		model.addAttribute("message", shoutString);
		
		return "hello-kid-v2";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName")  String studentName, Model model) {
		System.out.println("HomeController.processFormV3()"+studentName);
		
		String shoutString = "Ro welcomes you from V3 Dude"+ studentName.toUpperCase();
		
		model.addAttribute("message", shoutString);
		
		return "hello-kid-v2";
	}

}
