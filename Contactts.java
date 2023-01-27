package com.xworkz.tetra5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/frndzz")
public class Contactts extends HttpServlet{
	public Contactts() {
		System.out.println("running inside default constr...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("inside init method...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("running doGet in server..");
		System.out.println(Thread.currentThread().getName());
		String Name=req.getParameter("name");
		String Email=req.getParameter("mail");
		if(Email.length()>8)
		{
			System.out.println("valid Email");
		}
		else
		{
			System.out.println("Invalid Email");
		}
		String Mobile=req.getParameter("number");
		String comments=req.getParameter("comments");
		
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Mobile);
		System.out.println(comments);
		
		PrintWriter write=resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		if(Email.length()>8)
		{
		
		write.print("<span style='color:blue;'>");
		write.print(Email +" : Email is valid ");
		}
		else
		{
			write.print("<span style='color:green;'>");
			write.print(Email +" : Email is Invalid ");
		}	
		write.print("</span>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}
}
