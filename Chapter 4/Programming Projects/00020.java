/*
Programming Exercise 4.5
*/

import java.util.Scanner;

public class Exercise04_05 {
	public static void main(String[] args) {
		// Scanner my beloved
		Scanner input = new Scanner(System.in);

		// Prompts user for input
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		// Calculations
		double area = (numberOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSides)));

		// Displays result
		System.out.println("The area of the polygon is " + area);
	}
}
