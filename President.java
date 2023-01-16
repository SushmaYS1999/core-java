package com.xworkz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class President {
	public static void main(String[] args) {
		Map<String, String> country=new HashMap<String, String>();
		country.put("Colombia", "Ivan Duque Marquez");
		country.put("Afghanistan","Ashraf Ghani");
		country.put("Algeria","Abdelmadjid Tebboune");
		country.put("Pakistan", "Arif Alvi");
		country.put("Canada", "Elizabeth II ");
		country.put("China","Xi Jinping");
		country.put("Maldives", "Ibrahim Mohamed Solih");
		country.put("Egypt", "Abdel Fattah el-Sisi");
		country.put("Finland", "Sauli Niinisto");
		country.put("France", "Emmanuel Macron");
		country.put("United States","Joe Biden");
		country.put("Indonesia", "Joko Widodo");
		country.put("Italy", "Sergio Mattarella");
		country.put("Bangladesh", "Abdul Hamid");
		country.put("South Africa", "Cyril Ramaphosa");	
		country.put("Singapore", "Halimah Yacob");
		country.put("India","Ram Nath Kovind");
		country.put("Sri Lanka", "Gotabaya Rajapaksa");
		country.put("Nepal", "Bidhya Devi Bhandari");
		country.put("Germany", "Frank-Walter Steinmeier");
		
		System.out.println("===keys is ascending order===");
		Object keys[]=country.keySet().toArray();
		Arrays.sort(keys);
		for(int i=0;i<keys.length;i++)
			System.out.println(keys[i]);
		System.out.println("======update values if key length is above 10========");
		for(String val:country.keySet())
		{
			if( val.length() > 10)
			{
				country.replace(val,"Sangeetha");
			}
		}
		
		country.entrySet().forEach(e->System.out.println(e));
	}
}
