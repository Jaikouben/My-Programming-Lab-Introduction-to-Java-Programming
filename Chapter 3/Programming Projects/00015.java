/*
Programming Exercise 3.1
*/

import java.util.Scanner;

public class Exercise03_01{
	public static void main(String[] args){
		// Scanner my beloved
		Scanner input = new Scanner(System.in);
		
		// Gets values
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Calculations
		double temp = (b * b) - (4 * a * c);
		double discriminate = Math.pow(temp, 0.5);
		double r1 = (-b + discriminate) / (2 * a);
		double r2 = (-b - discriminate) / (2 * a);
		
		// Displays results
		if (discriminate > 0){
			System.out.println("This equation has two roots " + r1 + " and " + r2);
		}
		else if (discriminate == 0){
			System.out.println("This equation has one root " + r1);
		}
		else {
			System.out.println("This equation has no real roots");
		}
	}
}
