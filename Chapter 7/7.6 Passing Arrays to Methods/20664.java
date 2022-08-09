/*
Write the definition of a method reverse, whose parameter is an array of integers. The method reverses the elements of the array. The method does not return a value.
*/

public void reverse ( int[] a )
{
    for ( int i = 0 ; i < a.length/2 ; i++ )
    {
        int temp = a[i] ;
        a[i] =  a[a.length-i-1] ;
        a[a.length-i-1] = temp ;
    }
}
