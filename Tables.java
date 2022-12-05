package com;

class Tables{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=30;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("-------------------");
		for(j=1;j<=60;j++)
		{
			if(j%6==0)
			{
				System.out.println(j);
			}
		}
	}
}