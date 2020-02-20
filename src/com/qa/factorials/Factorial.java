package com.qa.factorials;

public class Factorial {
	
	int factorial(int i) {
		int result = i;
		for (int j = i -1; j > 0; j--) {
			result *= j;
		}
		return result;
	}

}
