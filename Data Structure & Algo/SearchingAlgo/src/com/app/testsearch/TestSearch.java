package com.app.testsearch;

import java.util.Scanner;

import com.app.searchalgo.SearchAlgo;

public class TestSearch {

	public static void main(String[] args) {
		SearchAlgo searchlist=new SearchAlgo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int []arr=new int[sc.nextInt()]; 
		System.out.println("Enter the element into array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element u want to search :");
		int key=sc.nextInt();
		searchlist.binarySearch(arr,key);
	}

}
