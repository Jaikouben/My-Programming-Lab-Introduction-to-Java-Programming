/*
Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
*/

for (int i = 80; i >= 20; i--){
	if ((i % 2) == 0){
		System.out.print(i + " ");
	}
}
