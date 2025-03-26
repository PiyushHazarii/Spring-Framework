package me.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.main.beans.User;
import me.main.service.Servicee;

@Controller
public class MyController {

	@RequestMapping("/")
	public String openIndexPage() {
		return "index";
	}

	@GetMapping("/addUserPage")
	public String openAddUserPage() {
		return "addUserPage";
	}

	@GetMapping("/deleteUser")
	public String deleteUserById() {
		return "deleteUser";
	}

	@Autowired
	Servicee servicee;

	@PostMapping("/addUserForm")
	public String addUserForm(@RequestParam("name1") String name, @RequestParam("email1") String email,
			@RequestParam("gender1") String gender, @RequestParam("city1") String city) {

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setCity(city);

		boolean status = servicee.addUser(user);
		if (status) {
			return "success";
		}
		return "error";
	}

	@PostMapping("/deleteUser")
	public String deleteUser(@RequestParam("id1") int id) {
		boolean status = servicee.deleteUser(id);
		if(status) {
			return "success";
		}
		return "error";
	}
}
