/*
Assume that price is an integer variable whose value is the price (in US currency) in cents of an item. Write a statement that prints the value of price in the form "X dollars and Y cents" on a line by itself. So, if the value of price was 4321, your code would print "43 dollars and 21 cents". If the value was 501 it would print "5 dollars and 1 cents". If the value was 99 your code would print "0 dollars and 99 cents".
*/

System.out.println(price / 100 + " dollars and " + price % 100 + " cents");
