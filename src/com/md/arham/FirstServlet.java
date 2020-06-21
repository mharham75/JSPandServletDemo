package com.md.arham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String firstName = req.getParameter("fname");
			String lastName = req.getParameter("lname");
			String fullName = firstName + lastName;
			//System.out.println(fullName);
			PrintWriter writer = resp.getWriter();
			writer.println(fullName);
	}

	//@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		String result = fName + lName;
		System.out.println(result);
		//PrintWriter writer = resp.getWriter();
		//writer.println(result);
	}
	
	

}
