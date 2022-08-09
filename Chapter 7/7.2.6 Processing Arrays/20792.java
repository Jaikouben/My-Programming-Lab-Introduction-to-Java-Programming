/*
Given an array of ints named x and an int variable named total that has already been declared, write some code that places the sum of all the elements of the array x into total. Declare any variables that you need.
*/

total = 0;

for (int k = 0; k < x.length; k++){
	total += x[k];
}
