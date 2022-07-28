/*
Given a Scanner reference variable named input that has been associated with an input source consisting of a sequence of integers and an int variable named total, write the code necessary to add all the integers in the input source and place their sum into total.
*/

total = 0;
while(input.hasNextInt()){
   total += input.nextInt();
}
