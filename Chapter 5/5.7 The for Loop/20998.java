/*
Write a for loop that prints in ascending order all the positive integers less than 200 that are divisible by both 2 and 3, separated by spaces.
*/

for (int i = 1; i <= 200; i++){
	if ((i % 2) == 0 && (i % 3) == 0){
		System.out.print(i + " ");
	}
}
