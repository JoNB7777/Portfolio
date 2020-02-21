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
	
	
	public int fibonacciRecursiveCalculation(int position) {
		if (position == 0) {
			return 0;
		} else if (position == 1) {
			return 1;
		}
		return fibonacciRecursiveCalculation(position - 1) + fibonacciRecursiveCalculation(position - 2);
	}
	
	
	public int fibonacciSequenceAlternative(int position) {
		if (position == 0) {
			return 0;
		}
		int firstPosition = 0;
		int nextPosition =1;
		for (int i = 1; i < position - 1; i++) {
			int temp = firstPosition;
			firstPosition = nextPosition;
			nextPosition = firstPosition + temp;
		}
		return nextPosition;
	}

}
