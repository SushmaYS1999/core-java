package com.xworkz;
public class Chocolate extends DairyMilk {
	public void choc()
	{
		System.out.println("Dairy milk all time fav choc");
	}
	public static void main(String[] args) {
		Chocolate c=new Chocolate();	
		c.choc();
		c.dm();
	}
}
