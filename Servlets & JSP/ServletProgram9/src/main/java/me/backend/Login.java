package me.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginForm")
public class Login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myemail = req.getParameter("myemail");
		String mypass = req.getParameter("mypass");
		
		if (myemail.equals("a@gmail.com") && mypass.equals("1234")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/profile");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/error.html");
			requestDispatcher.include(req, resp);

			// Now include index.html instead of forwarding again
			RequestDispatcher requestDispatcher2 = req.getRequestDispatcher("/login.html");
			requestDispatcher2.include(req, resp);
		}
		
	}
}
