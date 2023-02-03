package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl")
public class JSTLPracticeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Students sObj = new Students(101, "Bhavik Bhatia");		
		int arr[] = {1,2,3,4,5};
		
		req.setAttribute("Name", "Bhavik Bhatia");
		req.setAttribute("Arr", arr);
		req.setAttribute("stu", sObj);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("jstl.jsp");
		dispatcher.forward(req, res);
	}
}
