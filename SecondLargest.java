package com;

public class SecondLargest {
	public static void main(String[] args){
		int arr[] = new int[]{-36,-21,-7,-1,6,27,78,98,26,0,17};
		System.out.println("Array elements after sorting:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		
		
		System.out.println("second largest number is:"+arr[arr.length-2]);
		}


}
