/*
Programming Exercise 4.21
*/

// (Check SSN) Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid. Here are sample runs:
import java.util.Scanner;

public class Exercise04_21 {
	public static void main(String[] args){
		// Scanner my beloved
		Scanner input = new Scanner(System.in);
			
		// Prompts the user to enter a Social Security Number
		System.out.println("Enter a SSN: ");
		String ssn = input.nextLine();
		
		// Checks the validity
		boolean isValid = ssn.length() == 11 &&
		ssn.charAt(0) <= '9' && ssn.charAt(0) >= '0' &&
		Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2)) &&
		ssn.charAt(3) == '-' && Character.isDigit(ssn.charAt(4)) &&
		Character.isDigit(ssn.charAt(5)) && ssn.charAt(6) == '-' &&
		Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) &&
		Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10));
		
		// Prints the validity message
		if (isValid){
			System.out.println(ssn + " is a valid social security number");
		}
		else {
			System.out.println(ssn + " is an invalid social security number");
		}
	}
}
