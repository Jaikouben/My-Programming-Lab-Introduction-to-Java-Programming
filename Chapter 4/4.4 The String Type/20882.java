/*
Assume that word is a variable of type String that has been assigned a value. Assume furthermore that this value always contains the letters "dr" followed by at least two other letters. For example: "undramatic", "dreck", "android", "no-drip".

Assume that there is another variable declared, drWord, also of type String. Write the statements needed so that the 4-character substring word of the value of word starting with "dr" is assigned to drWord. So, if the value of word were "George slew the dragon" your code would assign the value "drag" to drWord.
*/

int letter1, letter2, letter3, letter4;
letter1 = word.charAt(0);
letter2 = word.charAt(1);
letter3 = word.charAt(2);
letter4 = word.charAt(3);

drWord = letter1 + letter2 + letter3 + letter4 + "";
