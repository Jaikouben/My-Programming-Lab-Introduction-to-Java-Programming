/*
Write a loop that reads strings from standard input where the string is either "land", "air", or "water". The loop terminates when "xxxxx" (five x characters) is read in. Other strings are ignored. After the loop, your code should print out 3 lines: the first consisting of the string "land:" followed by the number of "land" strings read in, the second consisting of the string "air:" followed by the number of "air" strings read in, and the third consisting of the string "water:" followed by the number of "water" strings read in. Each of these should be printed on a separate line.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

int land = 0;
int air = 0;
int water = 0;
String word = "";

while(!(word.equals("xxxxx"))){
	word = stdin.next();
	
	if(word.equals("land")){
    	land++;
	}
	else if(word.equals("air")){
    	air++;
	}
	else if(word.equals("water")){
    	water++;
	} 
}
System.out.println("land:" + land);
System.out.println("air:" + air);
System.out.println("water:" + water);
