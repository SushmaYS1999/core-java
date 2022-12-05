package com;

public class Num {
	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				if(i==3 && j==3)
				{
					System.out.print("x-workz");
				}
				else
				{
				System.out.print(j);
				}
			}
			System.out.println();
		}
		System.out.println("===========================");
		System.out.println("===========================");
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				if(i==1 && j==1)
				{
					System.out.print("x-workz");
				}
				else
				{
				System.out.print(i);
				}
			}
			System.out.println();
		}

	}
	
}
