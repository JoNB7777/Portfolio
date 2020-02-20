package com.qa.anagrams;

import java.util.ArrayList;

public class Anagram {
	
	public boolean anagramCheck(String a, String b) {
        boolean output = true;
        a = a.replaceAll(" ", "");
        b = b.replaceAll(" ", "");
        if (a.length() == b.length()) {
            ArrayList<Character> A = new ArrayList<>();
            ArrayList<Character> B = new ArrayList<>();
            for (char i : a.toLowerCase().toCharArray()) {
                A.add(i);
            }
            for (char i : b.toLowerCase().toCharArray()) {
                B.add(i);
            }
            A.sort(null);
            B.sort(null);
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) != B.get(i)) {
                    output = false;
                }
            }
        }
        else {
            output = false;
        }
        return output;
    }

}
