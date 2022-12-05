package com;

public class fibonocci {
	public static void main(String[] args) {
		int fno=0;
		int sno=1;
		System.out.println(fno);
		System.out.println(sno);
		int result=fno+sno;
		while(result<100)
		{
			System.out.println(result);
			fno=sno;
			sno=result;
			result=fno+sno;
		}
	}
}
