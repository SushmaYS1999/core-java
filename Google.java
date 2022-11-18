package com.xworkz;
public class Google extends SearchEngine{
	void browseer()
	{
		super.search();
		System.out.println("good browser");
	}
	public static void main(String[] args) {
		Google g=new Google();
		g.browseer();
		g.search();
		g.notFound();
	}
}
