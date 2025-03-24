package me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/home")
	public String openHomePage() {
		return "home";
	}
	
	
	@GetMapping("/adminPanel")
	public String openAdminPanel() {
		return "admin-panel";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage() {
		return "login";
	}
	
	@GetMapping("/errorPage")
	public String openErrorPage() {
		return "error";
	}
}
