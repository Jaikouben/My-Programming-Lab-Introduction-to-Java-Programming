/*
An array of ints, arr, has been declared and initialized. Write the statements needed to reverse the elements in the array. So, if the elements were originally 5, 13, 4, 97 then after your code executes they would be 97, 4, 13, 5.
*/

int k, temp;
for (k = 0; k < arr.length/2; k++) {
    temp = arr[k];
    arr[k] = arr[arr.length-1-k];
    arr[arr.length-1-k] = temp;
}
