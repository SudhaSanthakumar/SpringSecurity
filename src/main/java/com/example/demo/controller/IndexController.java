package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class IndexController {

	@GetMapping("/home")
	public String welcomeHome() {
		return "Welcome to Index Page";

	}

	@GetMapping("/user")
	public String welcomeUser() {
		return "Welcome to user Page";

	}

}