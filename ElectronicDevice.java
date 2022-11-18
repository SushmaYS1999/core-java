package com.xworkz;

public class ElectronicDevice extends  Laptop {
	public void ele()
	{
		System.out.println("Hp is better laptop");
	}
	public static void main(String[] args) {
		ElectronicDevice e=new ElectronicDevice();
		e.cost=25000;
		e.model="Hp";
		e.ele();
		e.lap();
		e.lapt();
		
	}
}
