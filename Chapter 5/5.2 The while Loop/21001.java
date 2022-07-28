/*
Given a String variable response that has already been declared, write some code that repeatedly reads a value from standard input into response until at last a Y or y or N or n has been entered.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

do {
   response = stdin.next();
}
while (!response.equals("Y") && !response.equals("y") && !response.equals("N") && !response.equals("n"));
