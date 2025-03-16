package me.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// is page ka meaning hai ki agar sahi email and pass nhi diya to wo error do dega hi 
// uske sath sath wo phir se login page yani ki index.html wala page open kr dega 
// then loop meion hote rahega ye kam jab tak wo sahi email and pass nhi de deta tab tak
@WebServlet("/aaa")
public class MyServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter out = resp.getWriter();
		String myemail = req.getParameter("myemail");
		String  mypass = req.getParameter("mypass");
		
		// include and forward ke case wo url mein koi change nhi krta hai bus request ko
		// aage piche krta hai   
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
