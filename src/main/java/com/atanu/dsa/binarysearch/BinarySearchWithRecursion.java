package com.atanu.dsa.binarysearch;

import java.util.Arrays;

public class BinarySearchWithRecursion {
	static boolean foundElement = false;

	public static void main(String[] args) {
		int[] arrayToSearch = { 1, 3, 7, 8, 5, 9, 11 };
		int elementToSearch = 20;
		Arrays.sort(arrayToSearch);
		binarySearch(arrayToSearch, elementToSearch);
		if (foundElement)
			System.out.println("Element found: " + elementToSearch);
		else 
			System.out.println("Element is not found: ");

	}

	private static void binarySearch(int[] arrayToSearch, int elementToSearch) {
		int low = 0;
		int high = arrayToSearch.length - 1;
		int midindex = Math.round((low + high) / 2);
		if (low <= high && arrayToSearch[midindex] == elementToSearch) {
			foundElement = true;
		} 	

		if (low!=high && arrayToSearch[midindex] > elementToSearch)
			binarySearch(Arrays.copyOfRange(arrayToSearch, low, midindex), elementToSearch);
		else if(low!=high)
			binarySearch(Arrays.copyOfRange(arrayToSearch, midindex + 1, high + 1), elementToSearch);
	}

}
