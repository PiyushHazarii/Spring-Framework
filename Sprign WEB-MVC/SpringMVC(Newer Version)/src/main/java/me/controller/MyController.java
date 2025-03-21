package me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController{
	
	@RequestMapping("/aaa")
	public ModelAndView openHelloPage() {
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
}

// sabse pehele hum pom mein dependency add kr denge then uske baad hum index.jsp mein 
// ek link provide kr denge then hum wo mapping ke liye use hoga then hum web.xml mein 
//dispatchersevlet ko configure krwa denge taaki wo har request handle kr ske then myds-servlet.xml 
//mein jaaye and beans banaye then waha se flow to to pata hi hai