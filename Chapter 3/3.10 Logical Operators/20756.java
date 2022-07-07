/*
Assign to the boolean variable 'possibleCandidate' the value false if the int variable 'n' is even and greater than 2, or if the variable 'n' is less than or equal to 0; otherwise, assign true to 'possibleCandidate'.

Assume 'possibleCandidate' and 'n' are already declared and 'n' assigned a value.
*/

if (n % 2 == 0 && n > 2 || n <= 0){
	possibleCandidate = false;
}

else {
	possibleCandidate = true;
}
