/*
Programming Exercise 5.1.
*/

import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args){
		// Scanner my beloved
		Scanner input = new Scanner(System.in);
		
		// Variables
		int positives = 0;
		int negatives = 0;
		int count = 0;
		float total = 0;
		int number;
		
		// Ask for input
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		
		// Loop
		do {
			// Reads in a number
			number = input.nextInt();
			// Checks if number is 0
			if (number == 0){
				System.out.println("No numbers are entered except 0");
				break;
			}
			
			// Checks if number is positive
			else if (number > 0){
				positives++;
				count++;
				total += number;
			}
			
			// Checks if number is negative
			else if (number < 0){
				negatives++;
				count++;
				total += number;
			}
		}
		while (number != 0);
		
		// Calculates the average 
		float average = total / count;
		
		// Displays results
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}
