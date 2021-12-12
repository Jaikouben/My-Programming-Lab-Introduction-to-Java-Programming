/*
Four integer variables, pos1, pos2, pos3, pos4 have been declared and initialized. Write the code necessary to "left rotate" their values: for each variable to get the value of the successive variable, with pos4 getting pos1's value.
*/

int temp1 = pos1;
int temp2 = pos2;
int temp3 = pos3;
int temp4 = pos4;
pos4 = temp1;
pos1 = temp2;
pos2 = temp3;
pos3 = temp4;
