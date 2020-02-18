package com.atanu.dsa.binarysearch;

import java.util.Arrays;

/**
 * @author Atanu Baidya
 *
 */
public class BinarySearchAlgo {

	public static void main(String[] args) {
		int[] arrayToSearch = { 1, 3, 7, 8, 5, 9, 11 };
		int elementToSearch = 8;
		int indexOfElement = binarySearch(arrayToSearch, elementToSearch);
		System.out.println("\nIndex of the searched element : "+elementToSearch+" is:"+indexOfElement);
	}

	private static int binarySearch(final int[] arrayToSearch, int elementToSearch) {
		Arrays.sort(arrayToSearch);
		for(int i =0;i<arrayToSearch.length;i++) {
			System.out.print(arrayToSearch[i]+" ");
		}
		int low = 0;
		int high = arrayToSearch.length - 1;
		while (low <= high) {
			int mid = Math.round((low + high) / 2);
			int guess = arrayToSearch[mid];
			if (guess == elementToSearch)
				return mid;
			if (guess > elementToSearch)
				high = mid - 1;
			if (guess < elementToSearch)
				low = mid + 1;
		}
		return -1;
	}

}
