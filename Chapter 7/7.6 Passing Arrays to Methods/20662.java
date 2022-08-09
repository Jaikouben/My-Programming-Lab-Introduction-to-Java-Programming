/*
Write the definition of a method named sumArray that has one parameter, an array of ints. The method returns the sum of the elements of the array as an int.
*/

public static int sumArray(int[] array){
	int sum = 0;
	for (int k = 0; k < array.length; k++){
		sum += array[k];
	}
	
	return sum;
}
