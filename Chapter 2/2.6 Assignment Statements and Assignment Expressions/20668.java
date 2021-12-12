/*
Given two int variables, i and j, which have been declared and initialized, and two other int variables, itemp and jtemp, which have been declared, write some code that swaps the values in i and j by copying their values to itemp and jtemp respectively, and then copying itemp and jtemp to j and i respectively.
*/

itemp = i;
jtemp = j;
i = jtemp;
j = itemp;
