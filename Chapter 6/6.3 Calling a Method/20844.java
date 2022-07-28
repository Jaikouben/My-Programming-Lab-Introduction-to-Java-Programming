/*
Write a method, getFirstLine, that is passed a String argument and that returns the first line. (Recall that lines are terminated with the "\n" character.) Assume that the argument contains at least one complete, newline-terminated line.
*/

public String getFirstLine(String line){
	// Gets position
	int position = line.indexOf("\n");
	
	// Gets line
	String firstLine = line.substring(0, position);
	
	// Returns username
	return firstLine;
}
