  
/* Author: Scott Reynders
	Date: 12/17/19
	
	Creating a program that solves 2 * 2 linear equations when a user enters the values in the equation
*/

import java.util.Scanner;

class  SolveTwobyTwoLinearEquation{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a: ");
			double a = input.nextDouble();
			
			System.out.print("Enter b: ");
			double b = input.nextDouble();
			
			System.out.print("Enter c: ");
			double c = input.nextDouble();
			
			System.out.print("Enter d: ");
			double d = input.nextDouble();
			
			System.out.print("Enter e: ");
			double e = input.nextDouble();
			
			System.out.print("Enter f: ");
			double f = input.nextDouble();
			
		
		double x = ((e * d - b * f) / (a * d - b * c));
		double y = ((a * f - e * c) / (a * d - b * c));
		double xyOne = a * d - b * c;
		
		if (xyOne == 0) {
			System.out.println("Cannot divide by zero ");
			System.out.println("  ");
		}
		else {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
	
}