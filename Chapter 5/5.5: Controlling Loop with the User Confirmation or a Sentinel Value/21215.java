/*
Given a Scanner reference variable named input that has been associated with an input source consisting of a sequence of lines, write the code necessary to read in every line and print them all out on a single line, separated by a space. There should NOT be a trailing space at the end of the line.
*/

String aString;

while (input.hasNext()){
	aString = input.nextLine();
	System.out.print(aString + " ");
}
