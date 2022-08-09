/*
Reversing the elements of an array involves swapping the corresponding elements of the array: the first with the last, the second with the next to the last, and so on, all the way to the middle of the array.

Given an array a and two other int variables, k and temp, write a loop that reverses the elements of the array.

Do not use any other variables besides a, k, and temp.
*/

for (k = 0; k < a.length / 2; k++){
   temp = a[k];
   a[k] = a[a.length-1-k];
   a[a.length-1-k] = temp;
}
