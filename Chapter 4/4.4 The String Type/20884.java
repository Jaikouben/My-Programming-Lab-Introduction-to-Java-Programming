/*
Assume that sentence is a variable of type String that has been assigned a value. Assume furthermore that this value is a String consisting of words separated by single space characters with a period at the end. For example: "This is a possible value of sentence."

Assume that there is another variable declared, secondWord, also of type String. Write the statements needed so that the second word of the value of sentence is assigned to secondWord. So, if the value of sentence were "Broccoli is delicious." your code would assign the value "is" to secondWord.
*/

int start = sentence.indexOf(" ") + 1;
int end = sentence.indexOf(" ", start+1);
secondWord = sentence.substring(start,end);
