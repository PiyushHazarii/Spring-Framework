package me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {

	@GetMapping("/loginPage")
	public String openLoginPage() {
		return "login";
	}

	@PostMapping("/loginForm")
	public String loginForm(HttpServletRequest req, Model model, HttpSession session) {
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");

		if (myemail.equals("a@gmail.com") && mypass.equals("123")) {
			session.setAttribute("myemail", myemail);
			session.setAttribute("mypass", mypass);
			return "profile";
		} else {
			model.addAttribute("login_error","Email and password didn't matched");
			return "login";
		}
	}
}