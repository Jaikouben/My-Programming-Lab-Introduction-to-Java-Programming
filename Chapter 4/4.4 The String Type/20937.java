/*
Assume that an int variable age has been declared and already given a value. Assume further that the user has just been presented with the following menu:

S: hangar steak, red potatoes, asparagus
T: whole trout, long rice, brussel sprouts
B: cheddar cheeseburger, steak fries, cole slaw

(Yes, this menu really IS a menu!)
Write some code that reads the String (S or T or B) that the user types in into a String variable choice that has already been declared and prints out a recommended accompanying drink as follows: if the value of age is 21 or lower, the recommendation is "vegetable juice" for steak, "cranberry juice" for trout, and "soda" for the burger. Otherwise, the recommendations are "cabernet", "chardonnay", and "IPA" for steak, trout, and burger respectively. Regardless of the value of age, your code should print "invalid menu selection" if the character read into choice was not S or T or B.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

choice = stdin.nextLine();
if(age <= 21){
	switch(choice){
		case "S": System.out.println("vegetable juice");
			break;
		case "T": System.out.println("cranberry juice");
			break;
		case "B": System.out.println("soda");
			break;
		default: System.out.println("invalid menu selection");
	}
}
else {
	switch(choice){
		case "S": System.out.println("cabernet");
			break;
		case "T": System.out.println("chardonnay");
			break;
		case "B": System.out.println("IPA");
			break;
		default: System.out.println("invalid menu selection");
	}
}
