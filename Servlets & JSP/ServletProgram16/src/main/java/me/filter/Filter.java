package me.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/regform")
public class Filter implements jakarta.servlet.Filter  {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		PrintWriter printWriter = resp.getWriter();
		if(name.length() < 3) {
			printWriter.print("Please Provide a correct Name");
		}else {
			filterChain.doFilter(req, resp);
		}
	}

}
