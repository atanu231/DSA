package com.atanu.dsa.recursion;

public class Factorial {

	public static void main(String[] args) {
        int total = calculateFact(5);
        System.out.println("Factorial of the given number: "+total);
	}

	private static int calculateFact(int i) {
		if(i==1)
			return i;
		else
			return i*calculateFact(i-1);
	}

}
