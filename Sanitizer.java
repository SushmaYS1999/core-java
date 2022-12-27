package com;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Sanitizer {
	public static void main(String[] args) {
		
		Integer[] val = new Integer[2];  
		
		SanitizerDTO SanitizerDTO1 = new SanitizerDTO(21,"Germinator",171,"red");
		SanitizerDTO SanitizerDTO2 = new SanitizerDTO(10,"Protizer",200,"blue");
		SanitizerDTO SanitizerDTO3 = new SanitizerDTO(9,"Sanido",511,"green");
		SanitizerDTO SanitizerDTO4 = new SanitizerDTO(31,"Refiner",861,"black");
		SanitizerDTO SanitizerDTO5 = new SanitizerDTO(51,"Freya",314,null);
		SanitizerDTO SanitizerDTO6 = new SanitizerDTO(81,"Sanizene",524,"red");
		SanitizerDTO SanitizerDTO7 = new SanitizerDTO(67,"Uncompromised",250,"purple");
		SanitizerDTO SanitizerDTO8 = new SanitizerDTO(89,"Handle Care",413,"white");
		SanitizerDTO SanitizerDTO9 = new SanitizerDTO(42,"Good as Gold",260,null);
		SanitizerDTO SanitizerDTO10 = new SanitizerDTO(61,"Plumpy",321,"pink");
		
		Collection<SanitizerDTO>collection=new LinkedList<SanitizerDTO>();
		collection.add(SanitizerDTO1);
		collection.add(SanitizerDTO2);
		collection.add(SanitizerDTO3);
		collection.add(SanitizerDTO4);
		collection.add(SanitizerDTO5);
		collection.add(SanitizerDTO6);
		collection.add(SanitizerDTO7);
		collection.add(SanitizerDTO8);
		collection.add(SanitizerDTO9);
		collection.add(SanitizerDTO10);
		
		System.out.println("total size "+collection.size());
		
		System.out.println("=======prize > 5=========");
		Iterator<SanitizerDTO> itr=collection.iterator();
		while(itr.hasNext())
		{
			SanitizerDTO element = itr.next();
			if(element.getPrice() > 5)
			{
				System.out.println("element get removed " +element);
			}
		}
		System.out.println("=======if any null=========");
		
		for(SanitizerDTO element:collection)
		{
			if(element.getId()==0 || element.getBrand()==null || element.getPrice()==0 || element.getColor()==null)
			{
				System.out.println(element);
			}
		}
		System.out.println("=======REMOVE COLOR=========");
		
		
		Iterator<SanitizerDTO> itr2=collection.iterator();
		while(itr2.hasNext())
		{
			SanitizerDTO element = itr2.next();
			if("red".equals(element.getColor())||"green".equals(element.getColor())||"blue".equals(element.getColor()))
			{
				System.out.println("remove element :"+element);
				itr2.remove();
			}
			
		}
		System.out.println("total sanitizer are:"+collection.size());
		
		
        System.out.println("=======MAX PRICE=========");
		
		Iterator<SanitizerDTO> iterator1 = collection.iterator();
		Integer max=0;
		for(SanitizerDTO val1:collection)
		{
			if(val1.getPrice()>max)
			{
				max=val1.getPrice();
			}
		}
		System.out.println(max);
        while(iterator1.hasNext()){  
        	SanitizerDTO element=iterator1.next();
        	if(element.getPrice()==max)
        	{
        		System.out.println(element);  
        	}
        }  
        System.out.println("=======SECOND MAX PRICE=========");
		
		Iterator<SanitizerDTO> iterator2 = collection.iterator();
		Integer secondMax=0;
		for(SanitizerDTO val1:collection)
		{
			if(val1.getPrice()<max)
			{
				secondMax=val1.getPrice();
			}
		}
		System.out.println(secondMax);
        while(iterator2.hasNext()){  
        	SanitizerDTO element=iterator2.next();
        	if(element.getPrice()==secondMax)
        	{
        		System.out.println(element);  
        	}
        }
        System.out.println("=======LEAST PRICE=========");
		
		Iterator<SanitizerDTO> iterator = collection.iterator();
		Integer min=0;
		for(SanitizerDTO val1:collection)
		{
			min=max;
			if(val1.getPrice()<min)
			{
				max=val1.getPrice();
			}
		}
		System.out.println(min);
        while(iterator.hasNext()){  
        	SanitizerDTO element=iterator.next();
        	if(element.getPrice()==min)
        	{
        		System.out.println(element);  
        	}
        }  
	}  
	}


