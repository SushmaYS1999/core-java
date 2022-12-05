package com;
import java.util.*;
class SumOfDigits{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	
	}


}