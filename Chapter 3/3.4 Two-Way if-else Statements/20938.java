/*
NOTE: in mathematics, the square root of a negative number is not real; in Java therefore, passing such a value to the square root function returns a value known as NaN (not-a-number).

Given a double variable named areaOfSquare write the necessary code to read in a value, the area of some square, into areaOfSquare and print out the length of the side of that square.

HOWEVER: if any value read in is not valid input, just print the message "INVALID".

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

areaOfSquare = stdin.nextDouble();
double length = Math.pow(areaOfSquare, 0.5);
	
if (areaOfSquare >= 0){
	System.out.println(length);
}

else {
	System.out.println("INVALID");
}
