/*
Programming Exercise 2.7
*/

// 525600 minutes in a year
import java.util.Scanner;

public class Exercise02_07 {
	public static void main(String[] args){
		// Asks for the number of minutes
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		// Calculations
		int years = minutes / 525600;
		int days = minutes % 525600;
		days = days / 1440;
		
		// Prints the results
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}
}
