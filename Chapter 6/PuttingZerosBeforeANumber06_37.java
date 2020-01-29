/* Author: Scott Reynders
	Date: 1/21/2020
	
	This program takes a width and a number form the user and adds a specific amount of zeros to the front of the number so that it fits the specified width.
*/

import java.util.Scanner;

class PuttingZerosBeforeANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		System.out.print("Enter width: ");
		int width = input.nextInt();
		
		System.out.print(format(number, width));
		
		
	}
	
	public static String format(int number, int width){
		String num = number + "";
			if (num.length() < width) {
				for(int i = width - num.length(); i > 0; i--){
					num = 0 + num;
			}
			
		}
			return num;
	
	}
}	
