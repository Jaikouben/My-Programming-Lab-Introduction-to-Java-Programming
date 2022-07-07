/*
Assume that x is a char variable has been declared and already given a value. Write an expression whose value is true if and only if x is an hexadecimal (Base 16) digit (0-9 plus A-F or a-f).
*/

((x >= '0' && x <= '9') || x == 'A' || x == 'B' || x == 'C' || x == 'D' || x == 'E' || x == 'F' || x == 'a' || x == 'b' || x == 'c' || x == 'd' || x == 'e' || x == 'f')
