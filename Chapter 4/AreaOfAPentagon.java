/* Author: Scott Reynders
		Date: 12/17/19
		
		Creating a program that finds the area of a pentagon.
*/

import java.util.Scanner;

class AreaOfAPentagon {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter the length from the center to the vertex: ");
			float vertex = input.nextFloat();

			double side = (2 * vertex) * (Math.sin(Math.PI / 5));

			double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

		System.out.print("The area of the pentagon is " + Math.round(area * 100) / 100.0);



	}
}