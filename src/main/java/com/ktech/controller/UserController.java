package com.ktech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.ktech.binding.User;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/")
	public String welcomePage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "index";
	}

	@PostMapping("/form")
	public String handleForm(@Valid User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "index";
		}
		model.addAttribute("user", "Login successful!");
		return "sucses";
	}
}
