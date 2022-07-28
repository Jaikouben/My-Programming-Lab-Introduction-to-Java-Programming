/*
Write a method, getSecondLine, that is passed a String argument and that returns the second line, without its newline character. (Recall that lines are terminated with the "\n" character.) Assume that the argument contains at least two complete, newline-terminated lines.
*/

public String getSecondLine(String line) {
    return line.substring(line.indexOf("\n") + 1, line.indexOf("\n") + 1 + line.substring(line.indexOf("\n") + 1, line.length()).indexOf("\n"));
}
