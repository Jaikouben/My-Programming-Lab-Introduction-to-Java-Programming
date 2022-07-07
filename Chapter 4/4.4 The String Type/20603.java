/*
Given the string variables name1, name2, and name3, write a fragment of code that assigns the largest value to the variable max (assume all three have already been declared and have been assigned values).
*/

if (name1.compareTo(name2)>0)max = name1;
else
   max = name2;
   if (name3.compareTo(max)>0)max = name3;
