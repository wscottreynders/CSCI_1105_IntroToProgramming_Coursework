/* Author: Scott Reynders
	Date: 1/6/2020
	
	Creating a calculator that calculates a specific employees wages after taxes.
*/

import java.util.Scanner;

class WageCalculator {

// This is were the user inputs the information about the employee.
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter employee's name: ");
	String employeeName = input.nextLine();
	
	System.out.print("Enter number of hours worked: ");
	double hoursWorked = input.nextDouble();
	
	System.out.print("Enter hourly pay rate: $");
	double hourlyPayRate = input.nextDouble();
	
	System.out.print("Enter federal tax withholding rate: ");
	double federalTax = input.nextDouble();
	
	System.out.print("Enter state tax withholding rate: ");
	double stateTax = input.nextDouble();

// These are the equations for calculating the final values using the user inputted values.
	double amountEarned = hourlyPayRate * hoursWorked;
	double amountToFeds = amountEarned * federalTax;
	double amountToState = amountEarned * stateTax;
	double totalDeduction = amountToFeds + amountToState;
	double netPay = amountEarned - amountToFeds - amountToState;

// This is were the the calculated values are displayed for the user.
	System.out.println(" ");
	System.out.println("Employee Name: " + employeeName);
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("Pay Rate: " + "$" + hourlyPayRate);
	System.out.println("Gross Pay: " + "$" + amountEarned);
	System.out.println("Deductions: ");
	System.out.print("        Federal Withholding (20.0%): ");
	System.out.printf("$%4.2f\n", amountToFeds);
	System.out.print("        State Withholding (9.0%): "); 
	System.out.printf("$%4.2f\n", amountToState);
	System.out.print("        Total Deductions: ");
	System.out.printf("$%4.2f\n", totalDeduction);
	System.out.printf("Net Pay: $%4.2f\n", netPay);
	
	}
}