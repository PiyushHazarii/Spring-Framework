package me.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import me.beans.Student;
// due to some error jab bhi hum jab bhi empty daal rahe hai name wo le raha hai kuch dikkat hua hai
// lekin code same hai ekdum
@Controller
public class MyController {

    @GetMapping("/regPage")
    public String openRegPage(Model model) {
        model.addAttribute("model_std", new Student());
        return "register";
    }

    @PostMapping("/regForm")
    public String handleRegForm(@Valid  @ModelAttribute("model_std") Student std, BindingResult bindingResult) {
        // insert into database code
    	
    	if(bindingResult.hasErrors()) {
    		return "register";
    	}else {
    		return "profile";
    	}
        
    }
}