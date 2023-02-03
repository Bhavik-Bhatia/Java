package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		//Get Data from Req		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
/*
 -------Request Dispatcher-----------------
 
		//Set Data with Req
		int k = num1+num2;
		req.setAttribute("sum", k);
		
		//Request forwarded to next Servlet
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);	
*/

/*
 -------Send Redirect(URL Rewriting)-----------------
		res.sendRedirect("sq?num1="+num1+"&num2="+num2);
*/


/*
 -------Send Redirect(Sessions)-----------------
		HttpSession session = req.getSession();
		session.setAttribute("num1",num1);
		session.setAttribute("num2",num2);		
		res.sendRedirect("sq");
		
*/
		Cookie cookie1 = new Cookie("num1", num1+"");
		Cookie cookie2 = new Cookie("num2",num2+"");
		
		res.addCookie(cookie1);
		res.addCookie(cookie2);
		
		res.sendRedirect("sq");
			
	}
	
}
