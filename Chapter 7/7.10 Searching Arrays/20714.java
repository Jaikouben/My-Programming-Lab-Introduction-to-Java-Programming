/*
You are given an int variable k, an int array zipcodeList that has been declared and initialized, and an boolean variable duplicates.

Write some code that assigns true to duplicates if there are two adjacent elements in the array that have the same value, and that assigns false to duplicates otherwise. Use only k, zipcodeList, and duplicates.
*/

duplicates = false;
for (k = 0; k < zipcodeList.length - 1; k++) {
    if (zipcodeList[k] == zipcodeList[k+1]) duplicates = true;
}
