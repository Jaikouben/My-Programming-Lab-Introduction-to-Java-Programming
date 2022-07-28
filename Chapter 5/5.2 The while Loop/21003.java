/*
Write a loop that reads positive integers from standard input, printing out those values that are even, each followed by a space, and that terminates when it reads an integer that is not positive. Declare any variables that are needed.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

int num=1;
while (num > 0){
	num = stdin.nextInt();
	if ((num % 2) == 0 && num > 0 ){
	System.out.print(num + " ");
	}
}
