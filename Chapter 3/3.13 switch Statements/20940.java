/*
Given a int variable named yesCount and another int variable named noCount and an int variable named response write the necessary code to read a value into into response and then carry out the following:

if the value typed in is a 1 or a 2 then increment yesCount and print out "YES WAS RECORDED"
if the value typed in is a 3 or an 4 then increment noCount and print out "NO WAS RECORDED"
If the input is invalid just print the message "INVALID" and do nothing else.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

response = stdin.nextInt();
switch (response){
	case 1: yesCount ++; System.out.println("YES WAS RECORDED");
		break;
	case 2: yesCount ++; System.out.println("YES WAS RECORDED");
		break;
	case 3: noCount ++; System.out.println("NO WAS RECORDED");
		break;
	case 4: noCount ++; System.out.println("NO WAS RECORDED");
		break;
	default: System.out.println("INVALID");
}
