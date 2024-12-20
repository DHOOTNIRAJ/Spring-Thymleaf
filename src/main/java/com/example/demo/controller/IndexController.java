package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.User;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		
		//validate
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		System.out.println(user.getEmail());
		System.out.println(user.getDob());
		
		model.addAttribute("firstname", user.getFname());
		model.addAttribute("lastname", user.getLname());
		model.addAttribute("Email", user.getEmail());
		
		return "welcome";
	}
}
