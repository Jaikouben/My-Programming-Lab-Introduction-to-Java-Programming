/*
Assume that sentence is a variable of type String that has been assigned a value. Assume furthermore that this value is a String consisting of words separated by single space characters with a period at the end. For example: "This is a possible value of sentence."

Assume that there is another variable declared, firstWord, also of type String. Write the statements needed so that the first word of the value of sentence is assigned to firstWord. So, if the value of sentence were "Broccoli is delicious." your code would assign the value "Broccoli" to firstWord.
*/

firstWord = sentence.split(" ")[0];
