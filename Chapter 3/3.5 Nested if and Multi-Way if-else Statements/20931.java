/*
Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books and offers 2 free books with every purchase of 8 or more books. It offers regular customers 1 free book with every purchase of 7 or more books, and offers 2 free books with every purchase of 12 or more books.

Write a statement that assigns freeBooks the appropriate value based on the values of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
*/

if (isPremiumCustomer == true){
	if (nbooksPurchased >= 5){
		freeBooks = 1;
	}
	else {
		freeBooks = 0;
	}

	if (nbooksPurchased >= 8){
		freeBooks = 2;

	}
}

else {
	if (nbooksPurchased >= 7){
		freeBooks = 1;
	}
	else {
		freeBooks = 0;
	}
	if (nbooksPurchased >= 12){
		freeBooks = 2;
	}
}
