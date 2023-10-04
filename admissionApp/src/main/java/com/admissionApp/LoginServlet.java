package com.admissionApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

public class LoginServlet extends HttpServlet {
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		 String email=request.getParameter("emailss");
		 String pass=request.getParameter("passwords");
		 HttpServletRequest req= (HttpServletRequest) request;
			HttpServletResponse res= (HttpServletResponse) response;
			 
			 
			HttpSession session=req.getSession();
			if(session ==null) {
				res.sendRedirect("login.html");	
			
			}
			else {
				
				String ema=(String)session.getAttribute("emails");
				String passw=(String)session.getAttribute("passwords");
				if(ema.equals(email)&& passw.equals(pass)) {
					res.sendRedirect("admissionForm.html");
				}
				else {
					res.sendRedirect("login.html");
				}
//					
//				}
				
			}
		 
	            
	        
	        
	        
	        
	    }
}
