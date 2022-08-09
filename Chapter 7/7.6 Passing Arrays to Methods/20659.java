/*
Write the definition of a method printArray, which has one parameter, an array of ints. The method does not return a value. The method prints out each element of the array, on a line by itself, in the order the elements appear in the array, and does not print anything else.
*/

public static void printArray(int[] array){	
	for (int i = 0; i < array.length; i++){
		System.out.println(array[i]);
	}
}
