package com.app.sorting;

public class SortAlgo 
{

	public void bubble(int[] arr)
	{
		for(int i=0;i<(arr.length-1);i++)
		{
			int count=0;
			for(int j=0;j<((arr.length-1)-i);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					//count++;
				}	
			}
			//if(count==0)
				//i=i+1;
			
		}
		
		
	}

	public void selection(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

	public void insertion(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

	public void quick(int[] arr) {
		
	}

	public void merge(int[] arr) {
		
	}

	public void radix(int[] arr) {
		
	}

}
