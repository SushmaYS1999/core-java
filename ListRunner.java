package com;

import java.util.List;
import java.util.ArrayList;

public class ListRunner {
	public static void main(String[] args) {
		List<String>list=new ArrayList();
		
		System.out.println("========ADD ELEMENT TO COLLECTION=========");
		list.add("S");
		list.add("S");
		list.add("H");
		list.add("M");
		for(String s : list)
		{
			System.out.println(s);
		}
		
		System.out.println("========ADD ELEMENT TO LIST=========");
		list.add(1, "A");
		for(String s : list)
		{
			System.out.println(s);
		}
		
		System.out.println("=========REMOVE ELEMENT TO COLLECTION===========");
		list.remove(4);
		for(String s : list)
		{
			System.out.println(s);
		}
		
		//System.out.println("=========REMOVE ELEMENT IN LIST===========");
		//list.remove(null)
		
		System.out.println("=========SET IN LIST===========");
		list.set(1, "U");
		for(String s : list)
		{
			System.out.println(s);
		}
		System.out.println("=========GET IN LIST===========");
		System.out.println(list.get(1));
	}
}
