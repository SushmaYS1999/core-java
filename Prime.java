package com;

public class prime {

	public static void main(String[] args) {
		int  n=49;
		boolean isprime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isprime=false;
			}
		}
		if(isprime)
		{
			System.out.println(n+" is prime");
		}
		else
		{
			System.out.println(n+" is not prime");
		}
	}
}