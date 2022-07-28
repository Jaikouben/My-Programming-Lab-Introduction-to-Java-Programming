/*
Given the integer variables x, y, and z, write a fragment of code that assigns the smallest of x, y, and z to another integer variable min.

Assume that all the variables have already been declared and that x, y, and z have been assigned values.
*/

if (x < y && x < z){
	min = x;
}
	
if (y < x && y < z){
	min = y;
}
	
if (z < x && z < y){
	min = z;
}
