package com.qa.borrowOrRob;

public class BorrowOrRob {
	
	public boolean borrowOrRob (String sentence) {
		String sen = sentence.replace(" ", "");
		String reversedString = "";
		for (int i = sen.length() - 1; i >= 0; i --) {
			reversedString = reversedString + sen.charAt(i);
		}
		return sen.equalsIgnoreCase(reversedString);
	}

}
