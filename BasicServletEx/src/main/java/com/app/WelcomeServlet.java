package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServlet extends GenericServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("init");
		super.init();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(req.getParameter("btn"));
		Integer n1 = Integer.parseInt(req.getParameter("num1"));
		Integer n2 = Integer.parseInt(req.getParameter("num2"));
		int sum = n1+n2;
		System.out.println("service");
		PrintWriter output = res.getWriter();
		output.print("<a href='home.html'>Back</a><br>");
		output.print("sum ="+sum);
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
		super.destroy();
	}

}
