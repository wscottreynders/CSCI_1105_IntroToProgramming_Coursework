/* Author: Scott Reynders
	Date: 12/16/19
	
	Writing code for a compund value calculator
*/

import java.util.Scanner;

class InterestCalculator {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter monthly saving amount: ");
	
	double amount = input.nextDouble();
	
	double interest = (amount + 506.289999900467801 * 1.0047);
	
	System.out.println("After the sixth months, " + "the account value is " + interest);
		
	}
}