package com;
class Even{
	public static void main(String[] args)
	{
		int arr[]={12,34,63,13,4,11,53,31,52};
		for(int i=0;i<arr.length;i++)
		if(arr[i]%2==0)
		{
			System.out.println(arr[i]+" Even number");
		}
		else
		{
			System.out.println(arr[i]+" odd number");
		}
	
	}


}