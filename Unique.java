package com;

public class Unique {
	public static void main(String[] args) {
		int c=0;
		String str="sumanth";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					c++;
					break;
				}
			}
		}
		if(c>=1)
		{
			System.out.println("not unique");
		}
		else
		{
			System.out.println(" unique");
		}
	}
}
