package me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
// all the things are correct but it does not run
// isme jo admin wala page hai wo browser open krwa raha hai
// agar humko spring se open krwana hai to ss dekho waha mil jayega just use form login
// to hamare pass securtiy window spring security provide karega
@Controller
public class MyController {
	
	@GetMapping("/home")
	public String openHomePage() {
		return "home";
	}
	
	@GetMapping("/adminPanel")
	public String openAdminPanelPage() {
		return "adminpanel";
	}
}
