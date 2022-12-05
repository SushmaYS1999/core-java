package com;

public class Demo {
	int a[]= {2,4,6};
	
	void dem() {
		for(int i=0;i<a.length;i++)
		{
			int b=a[i]+a[i];
			
			int c[]=new int[1];
			for(int j=0;j<c.length;j++)
			{
				c[j]=b;
				System.out.println(c[j]);
			}
		}
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.dem();
	}
}
