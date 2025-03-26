package me.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import me.main.beans.Student;
import me.main.services.LoginService;
import me.main.services.RegisterService;

@Controller
public class Controllers {

	@GetMapping("/")
	public String openHomePage() {
		return "homePage";
	}

	@GetMapping("/homePage")
	public String openHomePagee() {
		return "homePage";
	}

	@GetMapping("/aboutUsPage")
	public String openAboutUsPage() {
		return "aboutUsPage";
	}

	@GetMapping("/contactUsPage")
	public String openContactUsPage() {
		return "contactUsPage";
	}

	@GetMapping("/loginPage")
	public String openLoginPage() {
		return "loginPage";
	}

	@GetMapping("/registerPage")
	public String openRegisterPage() {
		return "registerPage";
	}

	@Autowired
	LoginService loginService;

	@PostMapping("/LoginForm")
	public String login(@RequestParam("email1") String email, @RequestParam("pass1") String password,
			HttpSession session, Model model) {

		List<Student> list = loginService.loginService(email, password);
		// i provide email.length as a validation if the length of email is not greater than
		// 3 then it will not logged in into the profile 
		if (!list.isEmpty() && email.length()>3 && password.length() >1) {
			session.setAttribute("session_name", list.get(0).getName());
			session.setAttribute("session_email", list.get(0).getEmail());
			session.setAttribute("session_gender", list.get(0).getGender());
			session.setAttribute("session_city", list.get(0).getCity());
			return "profilePage";
		}else {
			model.addAttribute("model_message","EmailId and password didn't matched");
			model.addAttribute("model_pagename", "login");
			return "errorPage";
		}
	}

	@GetMapping("/profilePage")
	public String openProfilePage() {
		return "profilePage";
	}

	@GetMapping("/logoutPage")
	public String logout(HttpSession session) {
		session.invalidate();
		return "loginPage";
	}

	@Autowired
	RegisterService registerService;

	@PostMapping("/regForm")
	public String register(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("pass") String password, @RequestParam(name = "gender",required = false) String gender,
			@RequestParam("city") String city, Model model) {
		Student std = new Student();
		std.setName(name);
		std.setEmail(email);
		std.setPassword(password);
		std.setGender(gender);
		std.setCity(city);

		boolean status = registerService.registerService(std);
		if (status && name.length()>3) {
			model.addAttribute("model_message","Student Registered Successfully");
			model.addAttribute("model_pagename", "register");
			return "successPage";
		} else {
			model.addAttribute("model_message","Student Not Registered Due to Some Error");
			model.addAttribute("model_pagename", "register");
			return "errorPage";
		}
	}

}
