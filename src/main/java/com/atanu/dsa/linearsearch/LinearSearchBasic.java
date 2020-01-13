package com.atanu.dsa.linearsearch;

/**
 * Linear searching of an element from the given array. If present, then return
 * the index number. else return -1.
 * 
 * @author Atanu Baidya
 *
 */
public class LinearSearchBasic {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6 };
		int searchInt = 5;
		int foundIndex = linearSearch(arr, searchInt);
		if (foundIndex == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + foundIndex);
	}

	private static int linearSearch(int[] arr, int searchInt) {
		for (int i = 0; i < arr.length; i++) {
			if (searchInt == arr[i])
				return i;
		}
		return -1;
	}

}
