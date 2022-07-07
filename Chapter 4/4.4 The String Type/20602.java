/*
Given the String variables name1 and name2, write a fragment of code that assigns the larger of the two to the variable first (assume that all three are already declared and that name1 and name2 have been assigned values).

(NOTE: "larger" here means alphabetically larger, not "longer". Thus, "mouse" is larger than "elephant" because "mouse" comes later in the dictionary than "elephant"!)
*/

if (name1.compareTo(name2)>0){
	first = name1;
}
else {
	first = name2;
}
