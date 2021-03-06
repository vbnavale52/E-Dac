package com.app.searchalgo;

public class SearchAlgo {
	public void lenearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				System.out.println("Key element present in the list:");
			return;
		}
	}

	public void binarySearch(int[] arr, int key) {
		int low = 0;
		int mid = 0;
		int high = arr.length;
		while (low <= high) {
			mid = low + high / 2;
			if (arr[mid] == key) {
				System.out.println(key + "is present at :" + mid);
				break;
			} else {
				if (arr[mid] < key)
					low = mid + 1;
				else
					high = mid-1;
			}
		}

	}
}
