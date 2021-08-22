package com.smart.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.entities.User;
import com.smart.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	/* User home handler*/
	@RequestMapping("/index")
	public String dashboard(Model model, Principal principal ) {
		String name = principal.getName();
		System.out.println("user : " + name);
		User user = userRepository.getUserByName(name);
		System.out.println("User Info: " + user);
		
		model.addAttribute("title", "User Dashboard");
		model.addAttribute("user", user);
		return "user/user_dashboard";
	
	}
}
