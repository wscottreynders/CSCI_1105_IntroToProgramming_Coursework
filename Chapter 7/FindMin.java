/* Author: Scott Reynders
	Date: 2/12/2020
	
	This program finds the smallest element in an array.
*/

import java.util.Scanner;

public class FindMin {

	private static Scanner input;
	private static double[] numbers;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		numbers = new double[10];
		
		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < numbers.length; i++ ) {
			numbers[i] = input.nextDouble();
		}
		
		System.out.print("The minimum number is: " + min(numbers));
	}
	
	public static double min(double[] array) {
		double min = array[0];
			for (double i : array) {
				
				if (i < min) 
						min = i;
		}
			return min;
	}

}
	

	
