/*
Programming Exercise 2.5
*/

import java.util.Scanner;

public class Exercise02_05 {
	public static void main(String[] args){
		// Creates a scanner
		Scanner input = new Scanner(System.in);
		
		// Prints a message
		System.out.println("Enter the subtotal and a gratituity rate: ");
		
		// Calculations 
		double subtotal = input.nextFloat();
		double gratuityRate = input.nextFloat();
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
		
		// Prints another message
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}
