/*
Write a loop that reads positive integers from standard input and that terminates when it reads an integer that is not positive. After the loop terminates, it prints out, separated by a space and on a single line, the sum of all the even integers read and the sum of all the odd integers read. Declare any variables that are needed.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

int number = 1;
int oddTotal = 0;
int evenTotal = 0;

while (stdin.hasNextInt() && number > 0)
{
    number = stdin.nextInt();
	if (number % 2 == 0 && number > 0){
    	evenTotal = evenTotal + number;
	}
 
	if (number % 2 != 0 && number > 0){
    	oddTotal = oddTotal + number;
	}
}

System.out.println(evenTotal + " " + oddTotal);
