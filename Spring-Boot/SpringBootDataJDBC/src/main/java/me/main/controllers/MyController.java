package me.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.main.beans.User;
import me.main.services.UserService;

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

	@GetMapping("/updateUserPage")
	public String openUpdateUserPage() {
		return "updateUserPage";
	}

	@GetMapping("/deleteUserPage")
	public String deleteUserPage() {
		return "deleteUserPage";
	}

	@GetMapping("/searchUserPage")
	public String searchUserPage() {
		return "searchUserPage";
	}

	@Autowired
	UserService userService;

	@PostMapping("/addUserForm")
	public String addUserForm(@RequestParam("name1") String name, @RequestParam("email1") String email,
			@RequestParam("gender1") String gender, @RequestParam("city1") String city) {

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setCity(city);

		boolean status = userService.addUserr(user);

		if (status) {
			return "success";
		}
		return "error";
	}

	@PostMapping("/updateUserForm")
	public String updateUserForm(@RequestParam("name1") String name, @RequestParam("email1") String email,
			@RequestParam("gender1") String gender, @RequestParam("city1") String city) {

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setCity(city);

		boolean status = userService.updateUser(user);

		if (status) {
			return "success";
		}
		return "error";
	}

	@PostMapping("/deleteUserForm")
	public String deleteUser(@RequestParam("email1") String email) {
		boolean status = userService.deleteUser(email);
		if (status) {
			return "success";
		}
		return "error";
	}

	@PostMapping("/searchUserForm")
	public String searchUser(@RequestParam("email1") String email, Model model) {
		User user = userService.searchUser(email);
		if (user != null) {
			model.addAttribute("model_user", user);
			return "userDetails";
		}
		return "error";
	}

	@GetMapping("/getAllUsers")
	public String getAllUser(Model model) {
		List<User> list = userService.getAllUsers();
		
		model.addAttribute("model_allusers",list);
		
		return "getAllUsers";
	}

}
