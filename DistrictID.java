package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class DistrictID {
	public static void main(String[] args) {
		
	Map<String, String> m=new HashMap<String, String>();
	m.put("Shimoga","KA14");
	m.put("Davangere","KA17");
	m.put("Mysore","KA");
	m.put("Chickmanglore","KA18");
	m.put("Udupi","KA20");
	m.put("Bellary","KA34");
	m.put("Ramanagar","KA42");
	m.put("Sagar","KA15");
	m.put("Kolar","KA07");
	m.put("Mandya",	"KA11");
	
	System.out.println("keys of a given map");
	m.keySet().forEach(e->System.out.println(e));
	System.out.println("------------------------");
	System.out.println("values of a given map");
	m.values().forEach(e->System.out.println(e));
	System.out.println("------------------------");
	System.out.println("both values and keys");
	m.entrySet().forEach(e->System.out.println(e));
	
	}
}
