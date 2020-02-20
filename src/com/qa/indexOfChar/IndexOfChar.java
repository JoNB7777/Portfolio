package com.qa.indexOfChar;

public class IndexOfChar {
	
	int indexOf(char c, String sentence) {
		int answer = -1;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == c) {
				answer = i;
				break;
			}
		}
		return answer;
	}

}
