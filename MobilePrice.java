package com.xworkz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MobilePrice {
	public static void main(String[] args) {
		Map<String,Integer> mob=new HashMap<String, Integer>();
		mob.put("Samsung",20000);
		mob.put("Vivo",15000);
		mob.put("Poco",25000);
		mob.put("One Plus",45000);
		mob.put("RedMe",18000);
		mob.put("Nokia",10000);
		mob.put("Asus",12000);
		mob.put("Apple",80000);
		mob.put("Real me",22000);
		mob.put("Sony",8000);
		
		System.out.println("==10 Entryes==");
		mob.entrySet().forEach(e->System.out.println(e));
		
		System.out.println("==Entryes in Upper cases==");
		for(String a:mob.keySet())
		{
			System.out.println(a.toUpperCase());
		}
		System.out.println("==If price is greater then 10000==");
		for(Integer b:mob.values())
		{
			if(b> 10000)
			{
				System.out.println(b);
			}
		}
		System.out.println("==If keys is less then 5 characters==");
		for(String s:mob.keySet())
		{
			if(s.length()<5)
			{
				System.out.println(s);
			}
		}
		System.out.println("==Entries in desc order==");
		List<Entry<String, Integer>> nlist= new ArrayList<>(mob.entrySet());
		nlist.sort(Entry.comparingByKey(Comparator.reverseOrder()));
		nlist.forEach(e->System.out.println(e));
		
		
		
		System.out.println("==Entries in desc order==");
		List<Entry<String,Integer>> l = new ArrayList<>(mob.entrySet());
		l.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		l.forEach(e->System.out.println(e));

	}

	
}
