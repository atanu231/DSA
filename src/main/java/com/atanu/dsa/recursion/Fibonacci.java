package com.atanu.dsa.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		printFibonacci(10);
	}

	private static void printFibonacci(int n) {
		int prev = 0;
		int next = 1;
		int temp;
		System.out.println(prev + "\n" + next);
		int counter = 0;
		while (counter != n) {
			counter++;
			temp = prev + next;
			prev = next;
			next =temp;
			System.out.println(temp);
		}

	}

}
