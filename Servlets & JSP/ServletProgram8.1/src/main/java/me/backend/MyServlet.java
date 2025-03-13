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

//	// agar hum sirf itna hi karenge to wo humko This is normal servlet page
//	// to print krwane ke sath sath wo html ka sara code hi print krwa dega 
//	// naaki h1 ke abdar likha gaya code 
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter printWriter = resp.getWriter();
//		printWriter.print("This is normal servlet page");
//		
//		
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.html");
//		requestDispatcher.include(req, resp);
//		
//	}
	
	
	// then ye donon page ko mila kr output dega...
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("This is normal servlet page");
		
		resp.setContentType("text/html");
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.html");
		requestDispatcher.include(req, resp);
		
	}
	
	
}
