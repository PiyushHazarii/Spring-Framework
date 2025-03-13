package me.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class MyServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter out = resp.getWriter();
		String myemail = req.getParameter("myemail");
		String  mypass = req.getParameter("mypass");
		
		if(myemail.equals("aaa@gmail.com") && mypass.equals("piyush")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/profile.html");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/error.html");
			requestDispatcher.include(req, resp);
			
			RequestDispatcher requestDispatcher2 = req.getRequestDispatcher("/index.html");
			requestDispatcher2.include(req, resp);
		}
	}
	
	
}
