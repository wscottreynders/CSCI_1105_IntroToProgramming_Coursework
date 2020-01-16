/* Author: Scott Reynders
	Date: 1/16/2020
	
	This code finds all numbers between 100 and 200 that are divisible by 5 or 6 but not by both.
*/

class IntegersOfFiveOrSix {
	public static void main(String[] args) {
	
	final int NUMBERS_IN_A_LINE = 10;
	int count = 0;


		for (int i = 100; i <= 200; i++) {
		
			if (i % 5 == 0 || i % 6 == 0) {
			count++;
		
			if (count % NUMBERS_IN_A_LINE == 0)
				System.out.println(i);
			else
				System.out.print(i + " ");
			}
		}
	}
}

