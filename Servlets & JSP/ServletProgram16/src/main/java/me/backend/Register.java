package me.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// isme agar filter lagana hai to hum ko webfilter lagana hoga filter.java mein and 
// same name provide krna hoga jaisa name webservlet mein diya hoga same wahi name 
// then wo humko sara validation check krke aage pass kr dega value jo bhi 
// dusra servlet hai ya filter hai usko....
@WebServlet("/regform")
public class Register extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println(name);
		printWriter.print(email);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}
}
