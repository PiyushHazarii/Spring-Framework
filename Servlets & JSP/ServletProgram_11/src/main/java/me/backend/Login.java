package me.backend;

import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginForm")
public class Login extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");
		String remembermee = req.getParameter("remember1");
		
		if(myEmail.equals("a@gmail.com") && myPass.equals("1")) {
			
			//it means we select the check box 
			if(remembermee != null) {
				Cookie cookie = new Cookie("loginStatus", "true");
				cookie.setMaxAge(60*60*24*365);
				resp.addCookie(cookie);
			}
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/profilePage");
			requestDispatcher.include(req, resp);
		}else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/error.html");
			requestDispatcher.include(req, resp);
			
			RequestDispatcher requestDispatcher2 = req.getRequestDispatcher("/login.html");
			requestDispatcher2.include(req, resp);
		}
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}

}
