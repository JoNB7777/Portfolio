package com.qa.fibonacciNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void recursionTest() {
		FibonacciNumbers fibonacci = new FibonacciNumbers();
		assertEquals(102334155, fibonacci.fibonacciRecursiveCalculation(40));
	}
	
	@Test
	public void iterationTest() {
		FibonacciNumbers fibonacci = new FibonacciNumbers();
		assertEquals(102334155, fibonacci.fibonacciSequenceAlternative(40));
	}
	
	@Test
	public void firstCalculationMethodTest() {
		FibonacciNumbers fibonacci = new FibonacciNumbers();
		assertEquals(102334155, fibonacci.fibonacciSequence(40));
	}

}
