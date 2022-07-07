/*
Write an if/else statement that compares the double variable pH with 7.0 and makes the following assignments to the int variables neutral, base, and acid:

0,0,1 if pH is less than 7
0,1,0 if pH is greater than 7
1,0,0 if pH is equal to 7
*/

if (pH < 7.0){
	neutral = 0;
	base = 0;
	acid = 1;
	
}
else if (pH > 7.0){
	neutral = 0;
	base = 1;
	acid = 0;
	
}
else if (pH == 7.0){
	neutral = 1;
	base = 0;
	acid = 0;
}
