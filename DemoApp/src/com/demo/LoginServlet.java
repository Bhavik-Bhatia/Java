package com.demo;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		boolean isLogin=false;
		
		//Step 1 - Driver Registration
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Step 2 - Make Row set Object
		JdbcRowSet rowSet;
		try {
			rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			//Step 3 - Make Connection
			rowSet.setUsername("root");
			rowSet.setPassword("");
			rowSet.setUrl("jdbc:mysql://localhost:3306/test");
			
			//Step 4 - Make Query
			rowSet.setCommand("select*from LoginTbl");
			
			//Step 5 - Execute
			rowSet.execute();
			
			//Step 6 - Get Data
			while(rowSet.next()) {
				String unametbl=rowSet.getString(1);
				String passtbl=rowSet.getString(2);				
				if(unametbl.trim().equals(uname.trim()) && passtbl.trim().equals(pass.trim())) {
					HttpSession session = req.getSession();
					session.setAttribute("Uname", uname);
					res.sendRedirect("Welcome.jsp");
					isLogin=true;
					break;
				}
			}
			if(!isLogin) {
				res.sendRedirect("Login.jsp");				
			}
			rowSet.close();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
