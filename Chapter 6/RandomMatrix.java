/* Author: Scott Reynders
	Date: 1/16/2020
	This program allows a user to input a number and displays an n by n matrix using zeros and ones
*/

import java.util.Scanner;

class RandomMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
		
	}
			
		public static void printMatrix(int n){
		
			for(int rows = 0; rows < n; rows++){
				for(int columns = 0; columns < n; columns++){
					System.out.print((int)(Math.random() * 2));
				}
					System.out.println();
		}
			
	}
	
}