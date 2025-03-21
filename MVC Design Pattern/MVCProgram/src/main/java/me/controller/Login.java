package me.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import me.beans.Student;
import me.service.StudentService;

@WebServlet("/loginform")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
		 resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		StudentService studentService = new StudentService();
		Student student = studentService.loginService(email, pass);
		
		
		
		if(student != null) {
			HttpSession session = req.getSession();
			session.setAttribute("session_student", student);
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/profile.jsp");
			requestDispatcher.forward(req, resp);
		}else{
			printWriter.println("<h3 style='color:red'>Email id and password didn't match</h3>");
			
			RequestDispatcher requestDispatcher2 = req.getRequestDispatcher("/login.html");
			requestDispatcher2.include(req, resp);
		}
	}

}
