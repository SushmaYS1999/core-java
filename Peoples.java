package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/pop")
public class Peoples extends HttpServlet{

	public Peoples() {
		System.out.println("running...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get from pepoles");
		String data="inside wesite...!!";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post from pepoles");
		String data="Car race !!, then crud race";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("put from people");
		String data="put the message here...!!";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType(data);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("delete from people");
		String data="delete the message here..!!";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType(data);
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("options from people");
		String data="choose options here ";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType(data);
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("trace from people");
		String data="trace peoples here";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType(data);
	}
	

	protected void doPatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("patch from people");
		String data = "patch peoples here";
		PrintWriter write = resp.getWriter();
		write.print(data);
		resp.setContentType(data);

	}
	
	
}
