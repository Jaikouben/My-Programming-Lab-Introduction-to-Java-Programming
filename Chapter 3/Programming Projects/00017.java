/*
Programming Exercise 3.11
*/

import java.util.Scanner;

public class Exercise03_11{
	public static void main(String[] args){
    // Scanner my beloved
		Scanner input = new Scanner(System.in);
		
		// Prompts user for input
		int month = input.nextInt();
		int year = input.nextInt();
		
		// Checks for leap year
		if(month == 2 && year % 4 == 0){
			System.out.println("February " + year + " 29");
		}
		
		// Prints results
		else {
			switch(month){
				case 1: System.out.println("January " + year + " 31");
					break;
				case 2: System.out.println("February " + year + " 28");
					break;
				case 3: System.out.println("March " + year + " 31");
					break;
			 	case 4: System.out.println("April " + year + " 30");
					break;
				case 5: System.out.println("May " + year + " 31");
					break;
				case 6: System.out.println("June " + year + " 30");
					break;
				case 7: System.out.println("July " + year + " 31");
					break;
				case 8: System.out.println("August " + year + " 31");
					break;
				case 9: System.out.println("September " + year + " 30");
					break;
				case 10: System.out.println("October " + year + " 31");
					break;
				case 11: System.out.println("November " + year + " 30");
					break;
				case 12: System.out.println("December " + year + " 31");
					break;
			}
		}
	}
}
