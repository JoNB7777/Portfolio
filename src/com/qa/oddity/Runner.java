package com.qa.oddity;

public class Runner {

	public static void main(String[] args) {
		Oddity example = new Oddity();
		int[] intArray = new int[10];
		intArray[0] = 1;
		intArray[1] = 4;
		intArray[2] = 5;
		intArray[3] = 7;
		intArray[4] = 8;
		intArray[5] = 10;
		intArray[6] = 14;
		intArray[7] = 19;
		intArray[8] = 23;
		intArray[9] = 28;
		System.out.println(example.oddity(intArray));

	}

}
