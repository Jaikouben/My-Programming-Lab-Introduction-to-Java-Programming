/*
Given an array temps of doubles, containing temperature data, compute the average temperature. Store the average in a variable called avgTemp. Besides temps and avgTemp, you may use only two other variables -- an int variable k and a double variable named total, which have been declared.
*/

total = 0;

for (k = 0; k < temps.length; k++){
	total += temps[k];
}

avgTemp = total / temps.length;
