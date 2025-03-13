package me.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/myser") // with the help of this we can directly see the output of the web page
					  // we dont need to create the web.xml file 
@WebServlet(name = "me",urlPatterns = {"/aaa","/bbb"}) // then hum do url se same output laa skte hai
public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("this is my second program");
	}
	
}
