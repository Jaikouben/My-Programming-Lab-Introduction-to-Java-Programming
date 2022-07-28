/*
Suppose that the code below is the body of some loop. Use a continue statement to make sure that nothing is written to standard out when y is 0.
*/

int x = stdin.nextInt();
int y = stdin.nextInt();
if (y == 0)
	continue;
System.out.println(x / y);
