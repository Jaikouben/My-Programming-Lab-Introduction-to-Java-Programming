/*
An array of integers named parkingTickets has been declared and initialized to the number of parking tickets given out by the city police each day since the beginning of the current year. (Thus, the first element of the array contains the number of tickets given on January 1; the last element contains the number of tickets given today.)

A variable named mostTickets has been declared, along with a variable k.

Without using any additional variables, write some code that results in mostTickets containing the largest value found in parkingTickets.
*/

mostTickets = 0;

for (k = 0; k < parkingTickets.length; k++){
	if (parkingTickets[k] > mostTickets){
		mostTickets = parkingTickets[k];
	}
}
