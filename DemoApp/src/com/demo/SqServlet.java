package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//To Show Result using Res Object
		
//		HttpSession session = req.getSession();
		
		
		Cookie c[] =req.getCookies();
		int num1=0,num2=0;
		
		for (Cookie cookie : c) {
			if (cookie.getName().equals("num1")) {
				num1 = Integer.parseInt(cookie.getValue());		
			}
			if (cookie.getName().equals("num2")) {
				num2 = Integer.parseInt(cookie.getValue());		
			}			
		}
		
				
		int k=num1+num2;
		
		PrintWriter write=res.getWriter();		
		write.println("Result Sum: "+k);
		write.print("Result Sq: "+num1*num2);
		
	}
}
