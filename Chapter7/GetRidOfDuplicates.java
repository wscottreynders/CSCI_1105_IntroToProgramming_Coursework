
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int[10];
		
		System.out.print("Enter 10 numbers separated by a space: ");
			for (int i = 0; i < numbers.length; i++)
					numbers[i] = input.nextInt();
			
		int[] distinctNumbers = eliminateDuplicates(numbers);
					
		System.out.print("Array without duplicates: ");
		for (int e: distinctNumbers) {
				if (e > 0)
					System.out.print(" " + e);
		}
				System.out.println();
	}	
	
	public static int[] eliminateDuplicates(int[] list) {
		int[]  uniqueList = new int[list.length];
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

