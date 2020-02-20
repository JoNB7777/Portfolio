package com.qa.findTheChar;

public class FindTheChar {
	
	public boolean findTheChar(String s, int i, char c) {
		char substringChar = s.charAt(i);
		return (substringChar == c);
	}

}
