package com.xworkz.tetra5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/loc")
public class Locations extends HttpServlet{
	public Locations() {
		System.out.println("inside location info...");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init method here...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method here...");
		System.out.println(Thread.currentThread().getName());
		String Name=req.getParameter("name");
		if(Name.length()>3)
		{
			System.out.println("name is valid");
		}
		else
		{
			System.out.println("name is Invalid");
		}
		String Email=req.getParameter("mail");
		String StartsFrom=req.getParameter("startsFrom");
		String Destination=req.getParameter("destination");
		String Gender=req.getParameter("gender");
		
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(StartsFrom);
		System.out.println(Destination);
		System.out.println(Gender);
		
		PrintWriter write=resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		if(Name.length()>3)
		{
		write.print("<span style='color:blue;'>");
		write.print("sign in sucessfull: " +Name);
		}
		else
		{
			write.print("<span style='color:black;'>");
			write.print("sign in Unsucessfull: " +Name);
		}
		write.print("</span>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}
	
	
	
}
