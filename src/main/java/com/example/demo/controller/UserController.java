package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured")
public class UserController {

	@GetMapping("/all")
	public String welcomeHome() {
		return "Welcome to Secured Index Page";

	}

	@GetMapping("/user")
	public String welcomeUser() {
		return "Welcome to Secured user Page";

	}

}
