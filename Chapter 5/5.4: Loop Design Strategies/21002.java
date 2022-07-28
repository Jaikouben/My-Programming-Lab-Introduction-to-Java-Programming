/*
Write a loop that reads positive integers from standard input, printing out those values that are greater than 100, each followed by a space, and that terminates when it reads an integer that is not positive. Declare any variables that are needed.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

int number;

do {
	number = stdin.nextInt();
	if (number > 100){
		System.out.print(number + " ");
	}
}

while (number > 0);
