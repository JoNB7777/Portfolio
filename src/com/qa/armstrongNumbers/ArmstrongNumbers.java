package com.qa.armstrongNumbers;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {
	
	public List<Integer> armstrong(int maxNumber) {
		List<Integer> armstrongNumbers = new ArrayList<Integer>();
		for (int i = 0; i <= maxNumber; i ++ ) {
			int digitsCubedSum = 0;
			List<Integer> digits = new ArrayList<Integer>();
			int divisor = 1;
			while (divisor <= i) {
				int digit = (i % (10*divisor)) / divisor;
				digits.add(digit);
				divisor = divisor*10;
			}
			for (int digit: digits) {
				digitsCubedSum += digit*digit*digit;
			}
			if (digitsCubedSum == i) {
				armstrongNumbers.add(i);
			}
		}
		return armstrongNumbers;
	}


}
