/* Author: Scott Reynders
	Date: 12/17/19
	
	Creating a program that calculates the cost of travel
*/

import java.util.Scanner;

class CostOfDriving {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter driving distance: ");
		
				double distance = input.nextDouble();
		
			System.out.print("Enter miles per gallon: ");
		
				double milesPerGallon = input.nextDouble();
		
			System.out.print("Enter price per gallon: ");
		
				double pricePerGallon = input.nextDouble();
		
		double findCostOfDriving = (distance / milesPerGallon * pricePerGallon);
		
		System.out.println("The cost of driving is " + "$" + findCostOfDriving);
	}
}