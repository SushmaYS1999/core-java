package com;
class Swap2{
	public static void main(String args[]){
		int first=25, second=5;
		System.out.println("before swappling:" +first + " " +second);
		
		{
			first=first-second; //20
			second=first+second; //25
			first=second-first; //5
			
			System.out.println("After swappling:" +first + " " +second);
		}
	
	}
}