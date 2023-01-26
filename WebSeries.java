package com.xworkz.tetra1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/webseries")
public class WebSeries extends HttpServlet{
	
	public WebSeries() {
		System.out.println(" created" +this.getClass().getSimpleName()); 
	}
	
	@Override
	public void init(ServletConfig congfig) throws ServletException {
		System.out.println("init in config ");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in WebSeries...!!");
		//System.out.println(Thread.currentThread().getName());
		String name=req.getParameter("seriesName");
		String language=req.getParameter("language");
		String episodes=req.getParameter("episodes");
		String ott=req.getParameter("ott");
		String budget=req.getParameter("budget");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:green;'>");
		write.print("Series name " + name + " is send successfully");
		write.print("</span>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}
	
	@Override
	public void destroy() {
		System.out.println("calling destroy method in webseries");
	}
	
}
