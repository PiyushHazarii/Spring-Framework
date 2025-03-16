
package me.backend;

import java.awt.image.Kernel;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/start")
public class Welcome extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		boolean loginnnstatus = false;
		
		Cookie cookie[] = req.getCookies();
		
		if(cookie != null) {
			for(Cookie ck : cookie) {
				if(ck.getName().equals("loginStatus") && ck.getValue().equals("true")) {
					loginnnstatus = true;
				}
			}
		}
		
		if(loginnnstatus == true) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/profilePage");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.html");
			requestDispatcher.forward(req, resp);
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
