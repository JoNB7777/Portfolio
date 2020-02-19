package com.qa.chickensAndRabbits;

public class ChickensOrRabbits {
	
	public void chickensAndRabbits(int heads, int legs) {
		int chickens = 0;
		int rabbits = heads;
		boolean validLegNumber = true;
		
		while ((chickens*2 + rabbits*4) != legs) {
			if (chickens > heads) {
				System.out.println("Invalid leg number");
				validLegNumber = false;
				break;
			} else {
				chickens += 1;
				rabbits -= 1;
			}
		}
		
		if (validLegNumber) {
			System.out.println("Number of chickens: " + chickens);
			System.out.println("Number of rabbits is: " + rabbits);
		}
	}

}
