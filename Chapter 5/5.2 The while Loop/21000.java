/*
Given an int variable n that has already been declared, write some code that repeatedly reads a value into n until at last a number between 1 and 10 (inclusive) has been entered.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

do {
	n = stdin.nextInt();
}
while (n < 1 || n > 10);
