package me.backend;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/myservlet" }, initParams = { @WebInitParam(name = "name1", value = "Piyush"),
		@WebInitParam(name = "age", value = "21") })
public class Servlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig servletConfig = getServletConfig();
		String myname = servletConfig.getInitParameter("name1");
		String myage = servletConfig.getInitParameter("age");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println(myname);
		printWriter.print(myage);

	}
}
