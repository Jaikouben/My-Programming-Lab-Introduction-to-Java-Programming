/*
NOTE: in mathematics, division by zero is undefined. So, in Java, division by zero is always an error.

Given a int variable named callsReceived and another int variable named operatorsOnCall write the necessary code to read values into callsReceived and operatorsOnCall and print out the number of calls received per operator (integer division with truncation will do).

HOWEVER: if any value read in is not valid input, just print the message "INVALID".

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

callsReceived = stdin.nextInt();
operatorsOnCall = stdin.nextInt();

if (operatorsOnCall > 0){
	System.out.println(callsReceived / operatorsOnCall);
}

else {
	System.out.println("INVALID");
}
