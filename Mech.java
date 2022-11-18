package com.xworkz;

public class Mech extends Engineer{
	void mechanical()
	{
		System.out.println("mechanical branch we also call it as Royal Mech ");
	}
	public static void main(String[] args) {
		Mech m = new Mech();
		m.prob();
		m.branches();
		m.mechanical();
		
	}
}
