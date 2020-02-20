package com.qa.fibonacciNumbers;

public class FibonacciNumbers {
	
	public int fibonacciSequence(int position) {
		int fibonacciArray[] = new int[position + 1];
		fibonacciArray[0] = 0;
		fibonacciArray[1] = 1;
		for (int i = 2; i <= position; i++) {
			fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
		}
		return fibonacciArray[position];
	}

}
