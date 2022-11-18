package com.xworkz;

public class Mca extends Degree{
	void mca()
	{
		System.out.println("MCA stands for Master of computer Applications");
	}
	void grad()
	{
		System.out.println("after mca we are master degree holders");
	}
	public static void main(String[] args) {
		Mca m = new Mca();
		m.ug();
		m.masters();
		m.mca();
		m.grad();
		
	}
}
