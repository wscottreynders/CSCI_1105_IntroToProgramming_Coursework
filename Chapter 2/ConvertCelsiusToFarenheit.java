/* Author: Scott Reynders
	Date: 12/16/19
	
	Writing a program that converst Celsius to Fahrenheit
*/

import java.util.Scanner;

class ConvertCelsiusToFahrenheit {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a degree in Celsius: ");
			
			double celsius = input.nextDouble();
		
		double findFahrenheitCalculation = ((9 * celsius / 5) + 32);
		
		System.out.println(celsius + " Celsius is " + findFahrenheitCalculation + " Fahrenheit");
		
	}
}