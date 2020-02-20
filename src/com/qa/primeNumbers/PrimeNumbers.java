package com.qa.primeNumbers;

public class PrimeNumbers {
	
	int numberOfPrimeNumbers(int maxNumber) {
		int primeCounter = 0;
		for(int i = 2; i <= maxNumber; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= (int) Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeCounter += 1;
			}
		}
		return primeCounter;
	}

}
