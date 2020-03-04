package com.atanu.dsa.sort.quicksort;

public class QuickSortAlgo {

	public static void main(String[] args) {
		int arrayToSort[] = { 12, 13, 2, 5, 1, 8, 15, 16, 4, 3 };
		int lower = 0;
		int upper = arrayToSort.length - 1;
		quickSort(arrayToSort, lower, upper);
		for (int i = 0; i < arrayToSort.length; i++)
			System.out.print(arrayToSort[i] + " ");
	}

	private static void quickSort(int[] arrayToSort, int lower, int upper) {
		if (lower < upper) {
			int pivotindex = partition(arrayToSort, lower, upper);
			quickSort(arrayToSort, lower, pivotindex - 1);
			quickSort(arrayToSort, pivotindex + 1, upper);
		}
	}

	private static int partition(int[] array, int lower, int upper) {
		int pivot = array[lower];
		int start = lower;
		int end = upper;
		while (start < end) {
			while (array[start] <= pivot && start < upper) {
				start++;
			}
			while (array[end] > pivot && end > lower) {
				end--;
			}
			if (start < end) {
				swap(array, start, end);
			}
		}
		swap(array, end, lower);
		return end;

	}

	private static void swap(int[] array, int start, int end) {
		int temp = array[end];
		array[end] = array[start];
		array[start] = temp;

	}

}
