/*
Assume that name and age have been declared suitably for storing names (like "Abdullah", "Alexandra" and "Zoe") and ages respectively. Assume also that stdin is a variable that references a Scanner object associated with standard input. Write some code that reads in a name and an age and then prints the message "The age of NAME is AGE" on a line by itself, where NAME and AGE are replaced by the values read in for the variables name and age. For example, if your code read in "Rohit" and 70 then it would print out "The age of Rohit is 70" on a line by itself. There should NOT be a period in the output.
*/

name = stdin.next();
age = stdin.nextInt();
System.out.println("The age of " + name + " is " + age);
