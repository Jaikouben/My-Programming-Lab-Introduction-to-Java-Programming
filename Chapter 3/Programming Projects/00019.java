/*
Programming Exercise 3.23
*/

import java.util.Scanner;

public class Exercise03_23{
	public static void main(String[] args){
		  // Scanner my beloved
    	Scanner input = new Scanner(System.in);

		  // Prompts user for input
	    System.out.print("Enter a pont with two coordinates: ");
    	double x = input.nextDouble();
    	double y = input.nextDouble();

		  // Calculations
		  double distanceX = Math.pow(x * x, 0.5D);
    	double distanceY = Math.pow(y * y, 0.5D);

    	if ((distanceY <= 2.5) && (distanceX <= 5.0)) {
        	System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
    	} 
		  else {
        	System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
   	  }
	 }
}
