/*
Given int variables k and total that have already been declared, use a while loop to compute the sum of the squares of the first 50 counting numbers, and store this value in total. Thus your code should put 1*1 + 2*2 + 3*3 +... + 49*49 + 50*50 into total. Use no variables other than k and total.
*/

k = 0; 
total = 0;

while (k <= 50){
	total += k * k;
	k++;
}
