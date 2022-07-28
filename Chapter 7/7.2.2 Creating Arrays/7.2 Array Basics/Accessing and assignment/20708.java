/*
Assume that an array of ints named a that contains exactly five elements has been declared and initialized. In addition, an int variable j has also been declared and initialized to a value somewhere between 0 and 3.

Write a single statement that assigns a new value to element of the array indexed by j. This new value should be equal to twice the value stored in the next element of the array (i.e. the element after the element indexed by j.
*/

a[j] = a[j + 1] * 2;
