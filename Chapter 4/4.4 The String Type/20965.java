/*
Assume that s is a String . Write an expression whose value is true if and only if the value of s would come between "mortgage" and "mortuary" in the dictionary.
*/

s.compareTo("mortgage") > 0 && s.compareTo("mortuary") < 0
