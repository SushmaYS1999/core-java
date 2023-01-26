package com.xworkz.tetra2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/kings")
public class King extends HttpServlet{
	
	public King() {
	System.out.println("created " + this.getClass().getSimpleName());
	
 }
	@Override
	public void init() throws ServletException {
		System.out.println("running init in server");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("call init in king...");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in kings....");
		System.out.println(Thread.currentThread().getName());
		String name=req.getParameter("kingName");
		String region=req.getParameter("place");
		String queens=req.getParameter("queens");
		String dob=req.getParameter("dob");
		String dod=req.getParameter("dod");
		
		System.out.println("name");
		System.out.println("region");
		System.out.println("queens");
		System.out.println("dob");
		System.out.println("dod");
		
		PrintWriter write=resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:pink;'>");
		write.print("king name "+name+ "is send successfully");
		write.print("</span>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method in king server...");
	}
	
	
}
