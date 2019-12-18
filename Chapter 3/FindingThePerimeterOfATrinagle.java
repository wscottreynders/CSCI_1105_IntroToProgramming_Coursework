/* Author: Scott Reynders
	Date: 12/18/19
	
	I am making a program that computes that perimeter of a triangle
*/

import java.util.Scanner;

class FindingThePerimeterOfATrinagle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter side A: ");
			double sideA = input.nextDouble();
		
			System.out.print("Enter side B: ");
			double sideB = input.nextDouble();
		
			System.out.print("Enter side C: ");
			double sideC = input.nextDouble();
		
			double perimeter = sideA + sideB + sideC;
			
			if(sideA >= sideB + sideC)
				System.out.println("Invalid");
				else if (sideB >= sideA + sideC)
					System.out.println("Invalid");
						else if (sideC >= sideA + sideB)
							System.out.println("Invalid");
			else
				System.out.println("The perimeter is " + perimeter);
					
	}
}