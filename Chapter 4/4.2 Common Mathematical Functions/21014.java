/*
Assume that x is a variable that has been declared as a double and been given a value.

Write an expression to compute the quartic root of x. The quartic root of a number is the square root of its square root.

EXAMPLES: For example, the quartic root of 16.0 is 2.0 because: the square root of 16.0 is 4.0 and the square root of 4.0 is 2.0. Another example: the quartic root of 81.0 is 3.0 because the square root of 81.0 is 9.0 and the square root of 9.0 is 3.0. Thus, to find the quartic root of a number you take the square root of the number and then take the square root of that.

In this exercise you must find the quartic root of x in a single expression-- you must not write any statements. Also, you may only use the sqrt() static method defined in the Math class-- no other methods.

(HINT: you will need to call the Math.sqrt() method twice-- and you will need to pass the return value of one of those calls as argument to the other call. AND REMEMBER: write an expression, not a statement.)
*/

Math.sqrt(Math.sqrt(x))
