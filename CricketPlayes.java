package com.xworkz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CricketPlayes {
	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<String, Integer>();
		m.put("Yuvraj Singh",50000);
		m.put("Kohli",11000);
		m.put("K L Rahul",8000);
		m.put("Rohith Sharma",12000);
		m.put("Harthik Pandya",7000);
		
		System.out.println("===5 entries=");
		m.entrySet().forEach(e->System.out.println(e));
		
		System.out.println("==sort in desc order==");
		List<Entry<String, Integer>> l = new ArrayList<>(m.entrySet());
		l.sort(Entry.comparingByKey(Comparator.reverseOrder()));
		l.forEach(e->System.out.println(e));
		
		System.out.println("===remove if runs > 10,000=");
		
		
		
		Iterator<Integer> iterator=m.values().iterator();
		while(iterator.hasNext())
		{
			Integer key=iterator.next();
			if(key < 10000)
			{
				iterator.remove();
			}
		}
		m.entrySet().forEach(e->System.out.println(e));
	}
}
