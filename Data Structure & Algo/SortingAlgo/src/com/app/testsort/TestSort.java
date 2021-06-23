package com.app.testsort;

import java.util.Iterator;
import java.util.Scanner;

import com.app.sorting.SortAlgo;

public class TestSort {

	public static void main(String[] args) {
		SortAlgo sort = new SortAlgo();
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while (flag != true)// while (!flag)
		{
			System.out.println("Enter the Array Size :");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the element");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Select Sorting Algorithm from folowing List for Sorting :");
			System.out.println("_________________Sorting Algo___________________" + "\n1 : Bubble Sort :"
					+ "\n2 : Selection Sort :" + "\n3 : Insertion Sort :" + "\n4 : Quick Sort : " + "\n5 : Merge Sort :"
					+ "\n6 : Radix Sort : " + "\n7 : EXIT :");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Sort the elements using bubble sort algo :");
				sort.bubble(arr);
				for (int i : arr) 
				{
					System.out.println(i+" ");
				}
				break;
			case 2:
				System.out.println("Sort the elements using Selection sort algo :");
				sort.selection(arr);
				for (int i : arr) {
					System.out.print(i+" ");
					
				}
				break;
			case 3:
				System.out.println("Sort the elements using Insertion sort algo :");
				sort.insertion(arr);
				for (int i : arr) {
					System.out.println(i+" ");
				}
				break;
			case 4:
				System.out.println("Sort the elements using Quick sort algo :");
				sort.quick(arr);
				break;
			case 5:
				System.out.println("Sort the elements using Merge sort algo :");
				sort.merge(arr);
				break;
			case 6:
				System.out.println("Sort the elements using Radix sort algo :");
				sort.radix(arr);
				break;
			case 7:
				flag = true;
				break;

			default:
				break;
			}

		}

	}

}
