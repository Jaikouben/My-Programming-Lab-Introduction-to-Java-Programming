/*
Three business partners are forming a company whose name will be of the form "Name1, Name2 and Name3". However, they can't agree whose name should be first, second or last. Help them out by writing code that reads in their three names and prints each possible combination exactly once, on a line by itself (that is, each possible combination is terminated with a newline character). Assume that name1, name2 and name3 have already been declared and use them in your code. Assume also that stdin is a variable that references a Scanner object associated with standard input. For example, if your code read in "Larry", "Curly" and "Moe" it would print out "Larry, Curly and Moe", "Curly, Larry and Moe", etc., each on a separate line.
*/

name1 = stdin.next();
name2 = stdin.next();
name3 = stdin.next();
System.out.println(name1 + ", " + name2 + " and " + name3 + "\n" + name1 + ", " + name3 + " and " + name2 + "\n" + name2 + ", " + name1 + " and " + name3 + "\n" + name2 + ", " + name3 + " and " + name1 + "\n" + name3 + ", " + name1 + " and " + name2 + "\n" + name3 + ", " + name2 + " and " + name1);
