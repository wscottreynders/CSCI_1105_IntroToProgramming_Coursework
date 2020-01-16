/* Author: Scott
	Date: 1/15/2020
	
	This program takes a sentence or word and outputs how many vowels the word or phraase contains.
*/

import java.util.Scanner;

class CountVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		int vowels = 0;					
		int consonants = 0;				
		

		// Count the number of vowels and consonants
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				if (Character.toUpperCase(string.charAt(i)) == 'A' ||
					 Character.toUpperCase(string.charAt(i)) == 'E' ||
					 Character.toUpperCase(string.charAt(i)) == 'I' ||
					 Character.toUpperCase(string.charAt(i)) == 'O' ||
					 Character.toUpperCase(string.charAt(i)) == 'U') {
					vowels++;
				}
				else
					consonants++;
			}

		// Display results
		}
		
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
		
	
	}
}