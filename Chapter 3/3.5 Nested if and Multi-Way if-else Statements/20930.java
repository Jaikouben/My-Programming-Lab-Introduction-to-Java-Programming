/*
Write a statement that compares the values of score1 and score2 and takes the following actions. When score1 exceeds score2, the message "player1 wins" is printed to standard out. When score2 exceeds score1, the message "player2 wins" is printed to standard out. In each case, the variables player1Wins,, player1Losses, player2Wins, and player2Losses,, are incremented when appropriate.

Finally, in the event of a tie, the message "tie" is printed and the variable tieCount is incremented.
*/

if (score1 > score2){
	System.out.println("player1 wins");
	player1Wins += 1;
	player2Losses += 1;
}
else if (score2 > score1){
	System.out.println("player2 wins");
	player2Wins += 1;
	player1Losses += 1;
}
else if (score1 == score2){
	System.out.println("tie");
	tieCount += 1;
}
