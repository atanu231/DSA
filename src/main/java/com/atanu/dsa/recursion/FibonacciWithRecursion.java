package com.atanu.dsa.recursion;

public class FibonacciWithRecursion {
	int prev = 0;
	int next = 1;
	int temp;

	public static void main(String[] args) {
		FibonacciWithRecursion fib = new FibonacciWithRecursion();
		System.out.println(fib.prev + "\n" + fib.next);
		fib.printFibonacci(10);
	}

	private void printFibonacci(int n) {
		if (n > 0) {
			temp = prev + next;
			prev = next;
			next = temp;
			System.out.println(temp);
			printFibonacci(n - 1);
		}

	}

}
