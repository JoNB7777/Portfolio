package com.qa.fizzBuzzPopSnap;

public class FizzBuzzPopSnap {
	
	public String fizzBuzzPopSnap(int number) {
		String answer = "";
		if (number % 3 == 0) {
			answer += "fizz";
		}
		if (number % 5 == 0) {
			answer += "Buzz";
		}
		if (number % 7 == 0) {
			answer += "Pop";
		}
		if (number % 11 == 0) {
			answer += "Snap";
		}
		if (answer.equals("")) {
			answer = String.valueOf(number);
		}
		return answer;
	}

}
