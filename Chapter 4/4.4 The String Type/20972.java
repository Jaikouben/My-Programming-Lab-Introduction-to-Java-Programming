/*
Assume that name has been declared suitably for storing names (like "Amy", "Fritz" and "Moustafa"). Assume also that stdin is a variable that references a Scanner object associated with standard input. Write some code that reads a value into name then prints the message "Greetings, NAMEVALUE!!!" on a line by itself where NAMEVALUE is replaced the value that was read into name. For example, if your code read in "Hassan" it would print out "Greetings, Hassan!!!" on a line by itself. 
*/

name = stdin.nextLine();
System.out.println("Greetings, " + name + "!!!");
