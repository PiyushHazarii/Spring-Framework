package me.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.main.beans.Student;
import me.main.services.LoginService;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class Controllers {
	
	@GetMapping("/") // or we use @RequestMapping both will work here 
	public String opneIndexPage() {
		return "index";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage() {
		return "login";
	}
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/loginForm")
	public String login(@RequestParam("email1") String email, 
						@RequestParam("pass1") String password,Model model) {
		
		List<Student> list = loginService.loginService(email, password);
		if(!list.isEmpty()) {
			model.addAttribute("model_student",list.get(0));
			return "profile";
		}
		return "error";
	}

}
