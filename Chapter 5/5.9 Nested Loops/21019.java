/*
Write a loop that displays all possible combinations of two letters where the letters are 'a', or 'b', or 'c', or 'd', or 'e'. The combinations should be displayed in ascending alphabetical order:

aa
ab
ac
ad
ae
ba
bb
...
ee
*/

char[] letters = {'a', 'b', 'c', 'd', 'e'};
for(int i=0; i < 5; i++){
   for(int ii=0; ii < 5 ; ii++){
      System.out.print(letters[i]);
      System.out.println(letters[ii]);
   }
}
