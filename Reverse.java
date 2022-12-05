package com;
import java.util.Scanner;
class Reverse{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int reverse=0;
		System.out.println("enter a number");
		int n=s.nextInt();
		while(n!=0)
		{
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n=n/10;
			
		}
		System.out.println(reverse);
	}

}
//
// 	String str="krjkj" nstr=" ";
// 	int strLength=str.length();
// 	for(int i=(strLength-1);i>=0;i--)
// 	{
// 		nstr=nstr+str.charAt(i);
//	}
// 	 if(str.tolowercase().equals(nstr.topowercase()))	
// 	{
	

// 	}
