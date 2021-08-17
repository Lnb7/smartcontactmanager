package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smart.dao.UserRepository;
import com.smart.entities.User;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value={"/", "/home"})
	public String home(Model model) {
		model.addAttribute("title", " Home : smart contact Manager");
		return "home";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About : Smart contact Manager");
		return "about";
	}
	
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title","Register : Smart contact manager");
		model.addAttribute("user", new User());
		return "signup";
	}
}
