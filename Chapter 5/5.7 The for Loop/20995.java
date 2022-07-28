/*
Write a for loop that prints in ascending order all the positive multiples of 5 that are less than 175, separated by spaces.
*/

for (int i = 1; i < 175; i++){
	if ((i % 5) == 0){
		System.out.print(i + " ");
	}
}
