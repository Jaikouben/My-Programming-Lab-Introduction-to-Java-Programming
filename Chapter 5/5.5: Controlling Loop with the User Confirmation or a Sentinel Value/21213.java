/*
Given a Scanner reference variable named input that has been associated with an input source consisting of a sequence of lines of text and an int variable named count, write the code necessary to count the lines of text in the input source and place that value into count.
*/

count = 0;
while(input.hasNext()){
   input.nextLine();
   count++;
}
