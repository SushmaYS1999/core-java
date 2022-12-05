package com;

public class reversenumber {
	public static void main(String[] args) {
		int n=1234,rem;
		while(n!=0)
		{
			rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
	}
}
