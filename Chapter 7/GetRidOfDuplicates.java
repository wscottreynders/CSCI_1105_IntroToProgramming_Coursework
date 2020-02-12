/* Author: Scott Reynders
	Date: 2/12/2020
	
	Ths program eliminates duplicates from a list of numbers and returns a new list.
*/

import java.util.Scanner;

class GetRidOfDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int[10];
		int count = 0;
		
		System.out.print("Enter 10 numbers separated by a space: ");
			for (int i = 0; i < numbers.length; i++)
					numbers[i] = input.nextInt();
					
		int[] distinctNumbers = eliminateDuplicates(numbers);
		
		System.out.print("Number of unique numbers is ");
		for (int e: distinctNumbers) {
				if (e > 0)
					count++;
		}		
			System.out.println(count);
	
					
		System.out.print("Array without duplicates: ");
		for (int e: distinctNumbers) {
				if (e > 0)
					System.out.print(" " + e);
		}
			System.out.println();	
	}		
	
	public static int[] eliminateDuplicates(int[] list) {
		int[] uniqueList = new int[list.length];
		int i = 0;
		
		for (int e: list) {
			if (linearSearch(uniqueList, e) == -1) {
				uniqueList[i] = e;
				i++;
			}
		}
		return uniqueList;
	}	

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
			return -1;
	}
}	