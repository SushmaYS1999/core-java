package com;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String names="anusha";
		String rev="";
		for(int i=names.length()-1;i>=0;i--)
		{
			rev+=names.charAt(i);
		}
		if(names.equals(rev)) {
			System.out.println("matched");
		}
		else
		{
			System.out.println("not matched");
		}
		
		//palindrime string
		 String str = "Radar", reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else 
		    {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		
		//reverse string
		String a="sushma", b= "" ;
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			b=ch+b;	
		}
		System.out.println(a +" is " +b);
		
		
		
		String name="java programming";
		System.out.println(name);
		for(int i=0;i<name.length();i++)
		{
			System.out.print(" "+name.charAt(i));
		}
		
		//reverse
		System.out.println("String reverse");
		System.out.println(name);
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(" "+name.charAt(i));
		}
		
		//count
		int count=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a')
			{
				count+=1;
			}
			else
			{
				count1+=1;
			}
		}
		System.out.println("count is " +count);
		System.out.println("count1 is " +count1);
		
		// each array to character																																									 
		String str1="today class";
		for(char ch:str1.toCharArray())
		{
			//System.out.print(ch+" ");
			if(ch=='o') {
				 count2+= 1;
			}
			System.out.print(ch+" ");
		}
		System.out.print("count: "+count2);
		}
	}


