/*
Write a loop that reads positive integers from standard input and that terminates when it reads an integer that is not positive. After the loop terminates, it prints out, on a line by itself, the sum of all the even integers read. Declare any variables that are needed.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

int number = 1;
int total = 0;
while (stdin.hasNextInt() && number > 0){
    number = stdin.nextInt();
	if (number % 2 == 0 && number > 0){
    	total = total + number;
	}
}
System.out.println(total);
