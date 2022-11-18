package com.xworkz;

public class Fruit extends Mango {
	void all()
	{
		System.out.println("mango is the national fruit of india which is loved by one and all");
	}
	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.shape="oval";
		f.color="red";
		f.man();
		f.mang();
		f.all();
		
			}
}
