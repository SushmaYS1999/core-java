package com;

public class Operator {
	
		static int opr(char s, int a, int b)
		{
			if(s=='+')
			{
				return a+b;	
			}
			if(s=='-')
			{
				return a-b;	
			}
			if(s=='*')
			{
				return a*b;	
			}
			if(s=='/')
			{
				return a/b;	
			}
			return a/b;
			
		}
		public static void main(String[] args) {
			System.out.println(opr('+',21,23));
			System.out.println(opr('-',10,8));
			System.out.println(opr('*',10,5));
			System.out.println(opr('/',20,5));
		}
	}


