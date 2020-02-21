package com.qa.primeNumbers;

public class PrimeNumbers {
	
	int numberOfPrimeNumbers(int maxNumber) {
		int primeCounter = 0;
		if (maxNumber >= 2) {
			primeCounter += 1;
		}
		for(int i = 3; i <= maxNumber; i += 2) {
			boolean isPrime = true;
			for (int j = 3; j <= (int) Math.sqrt(i); j += 2) {
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
