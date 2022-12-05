package com;
class Armstrong{
	public static void main(String[] args){
			int n=121,m,remainder,result=0;
			m=n;
			while(m!=0)
			{
				remainder=m %10;
				result+=Math.pow(remainder,3);
				m/=10;
			}
			if(result==n)
			{
				System.out.println(n +"is a Armstrong number");
			}
			else
			{
				System.out.println(n +"is not a Armstrong number");
			}
		}

}
	