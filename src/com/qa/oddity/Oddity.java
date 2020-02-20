package com.qa.oddity;

import java.util.ArrayList;
import java.util.List;

public class Oddity {
	
	public List<Integer> oddity (int[] nums) {
		List<Integer> numList = new ArrayList<Integer>();
		for (int num: nums) {
			if(num % 2 == 1) {
				numList.add(num);
			}
		}
		return numList;
	}

}
