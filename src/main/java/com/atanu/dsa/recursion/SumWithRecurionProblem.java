package com.atanu.dsa.recursion;

public class SumWithRecurionProblem {

	public static void main(String[] args) {
		int[] intarr = { 2, 4, 6 ,2};
		int index = 0;
		int sum = recursionSum(index, intarr);
		System.out.println(sum);
	}

	private static int recursionSum(int index, int[] intarr) {
		if (index == intarr.length - 1)
			return intarr[index];
		else
			return intarr[index] + recursionSum(index + 1, intarr);
	}

}
