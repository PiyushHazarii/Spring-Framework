
package me.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logoutPage")
public class Logout extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		
		Cookie cookie[] = req.getCookies();
		for(Cookie ck : cookie) {
			ck.setMaxAge(0);
			resp.addCookie(ck);
		}
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/logout.html");
		requestDispatcher.include(req, resp);
		
		
		RequestDispatcher requestDispatcher2 = req.getRequestDispatcher("/login.html");
		requestDispatcher2.forward(req, resp);
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
