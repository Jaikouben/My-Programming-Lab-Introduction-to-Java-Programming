/*
Programming Exercise 2.15
*/

import java.util.Scanner;

public class Exercise02_15{
	public static void main(String[] args){
		// Creates a new scanner
		Scanner input = new Scanner(System.in);
		
		// Asks for variables
		System.out.println("Enter x1 and y1: ");		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculations
		double distance = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
		distance = Math.pow(distance, 0.5);
		
    // Prints out the distance
		System.out.println("The distance between the two points is " + distance);
	}
}
