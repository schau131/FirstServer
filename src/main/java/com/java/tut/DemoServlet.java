package com.java.tut;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;
import java.util.stream.Collectors;  

public class DemoServlet extends HttpServlet{  
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  {  
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();  

		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("Hi, I am GET Http Request");  
		pw.println("</body></html>");  
		
		pw.close();//closing the stream  
		
	} 
	
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  {  
		
		res.setContentType("text/html"); 
		PrintWriter pw=res.getWriter();  

		String body = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
	
		
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("Hi, I am POST Http Request ad i received this in request as body : " + body);  
		pw.println("</body></html>");  
		
		pw.close();//closing the stream  
		
	} 
	
	@Override
	public void doPut(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  {  
		
		res.setContentType("text/html"); 
		PrintWriter pw=res.getWriter();  

		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("Hi, I am PUT Http Request");  
		pw.println("</body></html>");  
		
		pw.close();//closing the stream  
		
	} 

	@Override
	public void doDelete(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  {  
		
		res.setContentType("text/html"); 
		PrintWriter pw=res.getWriter();  

		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("Hi, I am DELETE Http Request");  
		pw.println("</body></html>");  
		
		pw.close();//closing the stream  
		
	} 
	
}