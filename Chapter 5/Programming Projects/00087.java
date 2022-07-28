/*
(Occurrence of max numbers)

Write a program that reads integers, finds the largest of them, and counts its occurrences. Assume that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and the occurrence count for 5 is 4.
Hint: Maintain two variables, max and count. max stores the current max number and count stores its occurrences. Initially, assign the first number to max and 1 to count. Compare each subsequent number with max. If the number is greater than max, assign it to max and reset count to 1. If the number is equal to max, increment count by 1.

Sample Run 1
Enter an integer (0: for end of input): 3
Enter an integer (0: for end of input): 5
Enter an integer (0: for end of input): 2
Enter an integer (0: for end of input): 5
Enter an integer (0: for end of input): 5
Enter an integer (0: for end of input): 5
Enter an integer (0: for end of input): 0
The occurrence count of the largest number is 4

Sample Run 2
Enter an integer (0: for end of input): 0
No numbers are entered except 0

Class Name: Exercise05_41

If you get a logical or runtime error, please refer https://liveexample.pearsoncmg.com/faq.html.
*/

import java.util.Scanner;

public class Exercise05_41 {
	public static void main(String[] args){
		// Scanner my beloved
		Scanner input = new Scanner(System.in);
		
		// Variables
		int max = 0;
		int count = 0;
		int number;
		
		// Prompts for first number
		System.out.println("Enter numbers: ");
		number = input.nextInt();
		
		// Continues if number is not equal to 0
		if (number != 0){
			max = number;
			count = 1;
			
			// Do while loop for checking more numbers
			do {
				number = input.nextInt();
				
				// Checks if the number is greater than the current max
				if (number > max){
					max = number;
					count = 1;
				}
				
				// Checks if the number is equal to the current max
				else if (number == max){
					count++;
				}
				
				// Checks if the number is equal to 0
				else if (number == 0){
					System.out.println("The largest number is " + max);
					System.out.println("The occurrence count of the largest number is " + count);
					break;
				}
			} 
			while (number != 0);
			
		}
		
		// Checks if number is 0
		else {
			System.out.println("No numbers are entered except 0");
		}
	}
}
