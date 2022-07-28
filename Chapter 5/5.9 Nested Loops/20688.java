/*
Assume that the int variables i and j have been declared, and that n has been declared and initialized.

Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.
*/

for ( i =1; i<= n; i++)
{
    for(j = 1; j<= i; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
