package me.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class MyServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ye karenge to ye print karwauega command prompt means terminal mein 
		//System.out.println("this is my first servlet program ");
		
		// but agar ye use karenge to ye direct web page mein print karwayega
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("This is my first servlet program"); 
	}
}
