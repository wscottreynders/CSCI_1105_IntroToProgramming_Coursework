/* Author: Scott Reynders
	Date: 12/16/19
	
	Writing a program that converst Celsius to Fahrenheit
*/

import java.util.Scanner;

class ConvertCelsiusToFahrenheit {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
			System.out.println("Enter a degree in Celsius: ");
			
			double Celsius = input.nextDouble();
		
		double FindFahrenheitCalc = ((9 * Celsius / 5) + 32);
		
		System.out.println(Celsius + " Celsius is " + FindFahrenheitCalc + " Fahrenheit");
		
	}
}