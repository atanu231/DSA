package com.atanu.dsa.sort.selectionsort;

/**
 * Selection Sort with ascending order. The main idea behind the selection sort
 * is to traverse from left to right in this example.While traversing, fix one
 * value(in a specific position) in the left side and find the smallest no (at
 * specific position) from the right sub array.Finally swap the elements between
 * the two numbers.
 * 
 * @author Atanu Baidya
 *
 */
public class SelectionSortAlgo {

	public static void main(String[] args) {
		int[] toSortarray = { 3, 5, 10, 2, 9, 4, 1, 15, 16, 11, 17 };
		int[] resultArr = makeSelectionSort(toSortarray);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}

	private static int[] makeSelectionSort(int[] toSortarray) {
		for (int i = 0; i < toSortarray.length; i++) {

			// Fix a value at a specific position
			int smallest_index = i;

			// Find index of the smallest number from the right side remaining sub array.
			for (int j = i + 1; j < toSortarray.length; j++) {
				if (toSortarray[j] < toSortarray[smallest_index])
					smallest_index = j;

			}

			// Once we have got the smallest number from the sub array and its specific
			// index. Swapping it with the Fixed value.
			int temp = toSortarray[smallest_index];
			toSortarray[smallest_index] = toSortarray[i];
			toSortarray[i] = temp;
		}
		return toSortarray;
	}

}
