/* Author: Scott Reynders
	Date: 2/7/2020
	
	This program adds the values of 2 3x3 matrices.
*/

import java.util.Scanner;

class AddingMatrices {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		
		double [][] a = new double[3][3];
		double [][] b = new double[3][3];
		
		System.out.println("Enter the values for " + a.length + " rows and " +
			a[0].length + " columns with each number separated by one space. Then press enter: ");
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				a[row][column] = input.nextDouble(); 
			}
		}
		
		System.out.println("Enter the values for " + b.length + " rows and " +
			b[0].length + " columns with each number separated by one space. Then press enter: ");
		for (int row = 0; row < b.length; row++) {
			for (int column = 0; column < b[row].length; column++) {
				b[row][column] = input.nextDouble(); 
			}
		}
		
		System.out.println(" ");
		displayMatrix(a);
		System.out.println("+");
		displayMatrix(b);
		System.out.println("=");
		displayMatrix(addMatrix(a, b));

	}
	
	public static void displayMatrix(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3.1f ", a[i][j]);
			}
				System.out.println();
		}
	}
		
	public static double[][] addMatrix(double[][] a, double[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			System.out.println("Matrices must have the same dimensions.");
			System.exit(1);
		}
	

		double[][] result = new double[a.length][a[0].length];
		
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
						result[i][j] = a[i][j] + b[i][j];
				}
			}
			return result;
	}
}
	