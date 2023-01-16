package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class CollageFee {
public static void main(String[] args) {
	Map<String, Integer> m=new HashMap<String, Integer>();
	m.put("BE",600000);
	m.put("BCA",100000);
	m.put("MCA",200000);
	m.put("Bcom",50000);
	m.put("BA",40000);
	m.put("MBA",150000);
	m.put("MTech",250000);
	
	System.out.println("keys of a given map");
	m.keySet().forEach(e->System.out.println(e));
	System.out.println("==================");
	
	System.out.println("values of a given map");
	m.values().forEach(e->System.out.println(e));
	
	System.out.println("==================");
	
	System.out.println("both key and values are");
	m.entrySet().forEach(e->System.out.println(e));
}
}
