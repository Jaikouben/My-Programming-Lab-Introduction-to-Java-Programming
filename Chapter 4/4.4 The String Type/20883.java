/*
Write a sequence of statements that finds the first comma in the String line, and assigns to the variable clause the portion of line up to, but not including the comma. You may assume that an int variable pos, as well as the variables line and clause, have already been declared.
*/

pos = line.indexOf(",");
clause = line.substring(0, pos);
