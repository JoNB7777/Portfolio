package com.qa.fibonacciNumbers;

public class Runner {

	public static void main(String[] args) {
		FibonacciNumbers example = new FibonacciNumbers();
		System.out.println(example.fibonacciSequence(40));
		System.out.println(example.fibonacciRecursiveCalculation(40));
		System.out.println(example.fibonacciSequenceAlternative(40));

	}

}
