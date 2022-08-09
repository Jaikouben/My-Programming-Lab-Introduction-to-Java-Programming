/*
Suppose you have two arrays of ints, arr1 and arr2, each containing ints that are sorted in ascending order.

Write a static method named merge that receives these two arrays as parameters and returns a reference to a new, sorted array of ints that is the result of merging the contents of the two arrays, arr1 and arr2.

Note: you do not need to (and should not) sort here. Think of having two sorted piles of cards, that you're combining (merging) into another pile. You keep putting cards into the new pile, sometimes taking from one of your original piles, sometimes taking from the other.
*/

public static int[] merge(int[] A, int[] B) {
   int result[] = new int[A.length+B.length];
   int idex_A = 0;
   int idex_B = 0;
   int idex_result = 0;
   while(idex_A < A.length || idex_B < B.length){
      if(idex_B >= B.length || (idex_A < A.length && A[idex_A] < B[idex_B]))
      result[idex_result++] = A[idex_A++];
      else result[idex_result++] = B[idex_B++];
   }
   return result;
}
